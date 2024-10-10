/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvividadeN2;

/**
 *
 * @author jeann.leite
 */
class ProvaUniversidade {
    private double av1;
    private double av2;

    
    public ProvaUniversidade(double av1, double av2) {
        this.av1 = av1;
        this.av2 = av2;
    }

    
    public double calcularMedia() {
        return (av1 + av2) / 2;
    }
}


class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double av1, double av2) {
        super(av1, av2);
    }

    
    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }
}


class ProvaFafifo extends ProvaUniversidade {
    public ProvaFafifo(double av1, double av2) {
        super(av1, av2);
    }

    
    public boolean aprovado() {
        return calcularMedia() >= 6.0;
    }
}
public class Prova {
    public static void main(String[] args) {
        
        ProvaUCB provaUCB = new ProvaUCB(4.5, 6.5);
        
        System.out.println("Aluno UCB aprovado? " + provaUCB.aprovado());

        
        ProvaFafifo provaFafifo = new ProvaFafifo(5.5, 6.5);
        
        System.out.println("Aluno Fafifo aprovado? " + provaFafifo.aprovado());
    }
}

