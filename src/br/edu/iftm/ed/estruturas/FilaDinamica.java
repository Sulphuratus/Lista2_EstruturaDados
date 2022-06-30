package br.edu.iftm.ed.estruturas;

public class FilaDinamica {

    //Funcionamento da estrutura sempre o primeiro a entrar será o primeiro a sair
    //FIFO

    private No cabeca;
    private No cauda;
    private int tamanho; // tamanho da fila

    // Estrutura de dados fila sempre insere no final, ou seja na cauda
    public void enfileirar(No novoElemento){

        // se a fila estiver vazia
        if(cabeca == null){
            cabeca = novoElemento; // adicionar o elemento na cabeça
            cauda = cabeca;
        }else{
            novoElemento.setProx(cauda.getProx());
            novoElemento.setAnt(cauda);
            //cauda.setAnt(cauda);
            //cauda.setProx(novoElemento.getAnt());
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }
        tamanho++;
    }

    // Pega o primeiro elemento e remove da fila

    public No desenfileirar() {
        No aux = cabeca;
        if (aux == null) {
            return null;
        }

        cabeca = cabeca.getProx();
        cabeca.setAnt(null);
        aux.setAnt(null);
        aux.setProx(null);
        tamanho--;
        return aux;

    }

    public void inverteFila() {
        No aux = cauda;
        cabeca = cauda;
        while (aux != null){
            aux.setProx(aux.getAnt());
            aux = aux.getAnt();
        }

    }

    public int getTamanho(){
        return tamanho;
    }

    public void imprimir (){
        System.out.print("Cabeça da fila: ");
        No aux = cabeca;
        while (aux != null){
            System.out.print(aux.getDado() + " <- ");
            aux = aux.getProx();
        }
        System.out.print("Cauda\n\n");

    }
}