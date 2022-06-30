package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.PilhaDinamica;
import br.edu.iftm.ed.estruturas.No;

public class Ex8 {

    public static void main(String[] args) {

        PilhaDinamica pilhaDin = new PilhaDinamica();
        No novoElemento = new No("0");
        pilhaDin.empilhar(novoElemento);
        novoElemento = new No("T", null);
        pilhaDin.empilhar(novoElemento);
        pilhaDin.empilhar(new No("R"));
        pilhaDin.empilhar(new No("E", null));
        pilhaDin.empilhar(new No("B", null));
        pilhaDin.empilhar(new No("O", null));
        pilhaDin.empilhar(new No("R", null));

        System.out.println("\nPilha montada formando um nome:");
        pilhaDin.imprimir();

        System.out.println("\nPilha convertida em String para inverter:");
        pilhaDin.converteInverte();

        System.out.println("\nPilha invertida:");
        pilhaDin.invertePilha();
        pilhaDin.imprimirInvertido();




        /*
        No removido = pilhaDin.desempilhar();
        System.out.println("O elemento removido foi: " + removido.getDado());
        removido = pilhaDin.desempilhar();
        System.out.println("O elemento removido foi: " + removido.getDado());
        pilhaDin.empilhar(new No("Z"));
        pilhaDin.imprimir();*/

    }
}