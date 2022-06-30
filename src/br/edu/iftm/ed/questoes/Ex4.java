package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Livro;
import br.edu.iftm.ed.estruturas.Pilha;
import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);

        for (int i=0; i < 2; i++){
            System.out.println("Digite o título do livro: ");
            String titulo = leia.nextLine();
            System.out.println("Digite o ano de lançamento: ");
            int anoLancamento = leia.nextInt();
            leia.nextLine();
            System.out.println("Digite o autor:");
            String autor = leia.nextLine();
            System.out.println("Digite o ISBN: ");
            String isbn = leia.nextLine();

            Livro l = new Livro(titulo, autor, anoLancamento, isbn);
            pilha.empilhar(l);
        }

        System.out.println("\nA pilha está vazia? " + pilha.estaVazia());
        System.out.println("\nTamanho da pilha: " + pilha.tamanho());
        System.out.println("\nTopo da pilha: " + pilha.topo());
        System.out.println("Empilhado com Sucesso? " + pilha.empilhar(new Livro("O Idiota ","Dostoievski ", 1867, "6598472")));
        System.out.println("\nImprimindo a pilha após incluir o último: ");
        System.out.println(pilha);
        System.out.println("\nDesempilhando: ");
        System.out.println(pilha.desempilhar());
        System.out.println("\nImprimindo a pilha após desempilhar último: ");
        System.out.println(pilha);

    }

}