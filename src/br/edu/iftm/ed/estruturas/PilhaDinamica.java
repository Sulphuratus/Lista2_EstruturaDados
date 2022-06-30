package br.edu.iftm.ed.estruturas;

public class PilhaDinamica {
    private No topo;
    private No topoi;
    private int tamanho; // o tamanho da pilha

    //adiciona um elemento no topo da pilha (push)
    public void empilhar(No novoElemento) {
        if (topo == null) {
            topo = novoElemento;
        } else {
            novoElemento.setProx(topo);
            topo = novoElemento
            ;
        }
        tamanho++;
    }

    // remove o topo da pilha
    public No desempilhar() {
        if (topo == null) {
            return null;
        }
        No aux = topo;
        topo = topo.getProx();
        aux.setProx(null);
        tamanho--;
        return aux;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void imprimir() {
        System.out.print("Topo ");
        No aux = topo;
        while (aux != null) {
            System.out.print(aux.getDado() + " | ");
            aux = aux.getProx();
        }
        System.out.print("Fundo\n");
    }

    public void converteInverte(){

        String temporaria = topo.getDado();
        String invertida = "";
        No aux = topo;

        for (int i = 0; i < tamanho-1 ; i++){
            //temporaria += aux.getDado().charAt(i);
            aux = aux.getProx();
            //System.out.println(aux.getDado() + "<- Dado ");
            temporaria += aux.getDado();
            topoi = aux;
        }

        for(int j = tamanho-1; j >= 0; j--){
            invertida += temporaria.charAt(j);
        }
        System.out.println(temporaria + " <- Nome original");
        System.out.println(invertida + " <- Nome invertido ");
    }

    public void invertePilha() {

        No aux = topo;
        No auxi = null;
        for (int i = 0; i<tamanho; i++) {
            aux = topo;
            topo = topo.getProx();
            aux.setProx(null);
            auxi = aux;
            auxi.setProx(topoi);
            topoi = auxi;
            //System.out.println(auxi.getDado() + " <-- Checa Inversao de Dados");
        }

    }

    public void imprimirInvertido() {
        System.out.print("Topo ");
        No auxi = topoi;
        for (int i = 0; i<tamanho; i++) {
            System.out.print(auxi.getDado() + " | ");
            auxi = auxi.getProx();
        }
        System.out.print("Fundo\n\n");

    }

}
