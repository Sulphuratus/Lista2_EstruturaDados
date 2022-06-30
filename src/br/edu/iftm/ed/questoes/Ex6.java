package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.ListaDuplamenteLigada;
import br.edu.iftm.ed.estruturas.No;

public class Ex6 {

    public static void main(String[] args) {

        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        No novoElemento = new No("A", null, null);
        lista.adicionar(novoElemento);
        lista.adicionar(new No("B", null, null));
        lista.adicionar(new No("C", null, null));
        lista.adicionar(new No("D", null, null));
        System.out.println("*** Lista criada inicialmente: ");
        lista.print();
        novoElemento = new No("E", null, null);
        lista.adicionar((novoElemento));
        System.out.println("*** Lista após inserir um elemento no final: ");
        lista.print();
        lista.adicionar(2,new No("Z", null, null));
        System.out.println("*** Lista após inserir um elemento na posição 2: ");
        lista.print();
        lista.remove(3);
        System.out.println("*** Lista após excluir elemento na posição 3: ");
        lista.print();
        lista.adicionar(new No("K", null, null));
        lista.adicionar(new No("Y", null, null));
        System.out.println("*** Lista após inserir dois novos elementos K e Y: ");
        lista.print();
        lista.removeUltimaDligada();
        System.out.println("*** Lista após excluir ultimo elemento: ");
        lista.print();



    }

}