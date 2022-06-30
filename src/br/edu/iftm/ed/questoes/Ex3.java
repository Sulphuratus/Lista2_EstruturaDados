package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Contato;
import br.edu.iftm.ed.estruturas.Agenda;

public class Ex3 {

    public static void main(String[] args) {

        Agenda<Contato> fila1 = new Agenda<>();

        fila1.enfileirar(new Contato("Joao", "999333444"));
        fila1.enfileirar(new Contato("Maria", "99999999"));
        fila1.enfileirar(new Contato("Pedro", "888996322"));
        fila1.enfileirar(new Contato("Augusto", "2526263665"));
        fila1.enfileirar(new Contato("Roberta", "1234567890"));
        System.out.println(fila1.toString());

    }

}