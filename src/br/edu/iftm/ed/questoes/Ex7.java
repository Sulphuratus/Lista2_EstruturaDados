package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.Fila;
import br.edu.iftm.ed.estruturas.No;
import br.edu.iftm.ed.estruturas.FilaDinamica;

public class Ex7 {

    public static void main(String[] args) {

// INVERSÃO PARA FILA ESTÁTICA ===========================================

        Fila<String> fila = new Fila<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        System.out.println("A Fila está vazia? " + fila.estaVazia());
        System.out.printf("O tamanho da fila é %s \n", fila.tamanho());
        System.out.println(fila);
        fila.inverter();
        System.out.println("Fila após a inversão: ");
        System.out.println(fila);
        System.out.println("O primeiro elemento é: " + fila.espiar());
        System.out.println("O valor desenfileirado foi: " + fila.desenfileirar());
        System.out.println(fila);
        fila.enfileirar("F");
        System.out.println(fila);
        fila.inverter();
        System.out.println("Fila após nova inversão: ");
        System.out.println(fila);

// INVERSÃO PARA FILA DINÂMICA (COMENTADO) ===========================================

        /*FilaDinamica filaDin = new FilaDinamica();
        No novoElemento = new No("A");
        filaDin.enfileirar(novoElemento);
        novoElemento = new No("B", null, null);
        filaDin.enfileirar(novoElemento);
        filaDin.enfileirar(new No("C")); // mesma coisa de fazer como nas 2 linhas anteriores (que é a mesma coisa das outras 2 linhas anteriores///////0
        filaDin.enfileirar(new No("D", null, null)); // segundo método construtor do objeto "No"
        filaDin.imprimir();
        filaDin.enfileirar(new No("E"));
        filaDin.imprimir();

        System.out.println("Fila invertida: ");
        filaDin.inverteFila();
        filaDin.imprimir();*/

    }
}