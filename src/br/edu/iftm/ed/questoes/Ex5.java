package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.ListaLigada;
import br.edu.iftm.ed.estruturas.No;

public class Ex5 {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        No novoElemento = new No("A", null);
        lista.adicionar(novoElemento); //ou criando o objeto
        lista.adicionar(new No("B", null)); // ou instanciando direto
        lista.adicionar(new No("C", null));
        lista.adicionar(new No("D", null));
        novoElemento = new No("E", null);

        System.out.println("=====Imprimir lista após criação=====");
        lista.imprimir();

        lista.adicionar(2,novoElemento);
        System.out.println("=====Imprimir lista após adicionar elemento na posição especificada=====");
        lista.imprimir();

        System.out.println("Lista contem o elemento? " + lista.contem("Z"));

    }

}

