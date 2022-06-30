package br.edu.iftm.ed.estruturas;

public class No {

    private String dado;
    private No prox;
    private No ant;


    public No() {    }

    public No(String dado) {
        this.dado = dado;
    }

    public No(String dado, No prox) {
        this.dado = dado;
        this.prox = prox;
    }

    public No(String dado, No ant, No prox) {
        this.dado = dado;
        this.ant = ant;
        this.prox = prox;
    }

    public String getDado() {
        return this.dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return this.prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}