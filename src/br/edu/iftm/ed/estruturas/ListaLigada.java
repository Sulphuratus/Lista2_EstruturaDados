package br.edu.iftm.ed.estruturas;

public class ListaLigada {

    private No cabeca;
    private No cauda;




    //metodo que adiciona no fim da lista
    public void adicionar(No novoElemento){
        if(cabeca == null){
            this.cabeca = novoElemento;
            this.cauda = cabeca;
        }else{
            cauda.setProx(novoElemento);
            cauda = novoElemento;
        }

    }

    public void adicionar(int posicao, No novoElemento){
        No aux = this.cabeca;
        int i = 0;
        while(aux.getProx() != null && i < posicao-1){
            aux = aux.getProx();
            i++;
        }

        novoElemento.setProx(aux.getProx());
        aux.setProx(novoElemento);

    }


    //Método do Exercício numero 5 da lista 2 de exercicios: Implemente um método
    // "contem" na classe Lista Dinamica Simplesmente Ligada, semelhante ao método
    // "contains" da classe "ArrayList";

    public boolean contem(String dado){
        No aux = this.cabeca;
        No buscador = this.cabeca;
        int i = 0;
        // Move o nó para a posição do nó anterior que deseja excluir
        while(aux.getProx() != null){
            aux = aux.getProx();
            i++;
        }
        int tamanholl = i;

        int k=0;
        while(buscador.getProx() != null && k < tamanholl){
            if(dado.equals(buscador.getDado())) {
                return true;
            }
            buscador = buscador.getProx();
            //buscador.setProx(buscador.getProx());
            k++;
        }
        if(dado.equals(buscador.getDado())) {
            return true;
        }

        return false;
    }

    public void remove(int posicao){
        No aux = this.cabeca;
        int i = 0;
        // Move o nó para a posição do nó anterior que deseja excluir
        while(aux.getProx() != null && i < posicao - 1){
            aux = aux.getProx();
            i++;
        }
        //No temp = aux.getProx(); // linha criada para guardar a informação (boas práticas)

        aux.setProx(aux.getProx().getProx());

        if(aux.getProx() == null){
            cauda = aux;
        }

        //temp.setProx(null); // linha para fechamento do ciclo apenas (boas práticas)
    }



    public void imprimir(){
        No aux = cabeca;
        while(aux != null){
            System.out.print(aux.getDado()+"-> ");
            aux = aux.getProx();
        }
        System.out.println("Fim\n\n");
    }

    public void removeUltima(){
        No aux = this.cabeca;
        while((aux.getProx()).getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(null);
        this.cauda = aux;
    }

    public void removePrimeiro(){
        this.cabeca = this.cabeca.getProx();
    }

}