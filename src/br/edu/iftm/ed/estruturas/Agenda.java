package br.edu.iftm.ed.estruturas;

public class Agenda<T> extends Fila<T> {

    @Override
    public boolean enfileirar(T elemento){
        Comparable<T> chave1 = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++) {
            if(chave1.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.enfileirar(i, elemento);

        return true;
    }
}