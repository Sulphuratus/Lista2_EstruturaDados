package br.edu.iftm.ed.estruturas;

public class Pilha<T>{


        private T[] elementos;
        private int tamanho;

        public Pilha(int capacidade){
            elementos = (T[]) new Object [capacidade];
            tamanho = 0;
        }

        public Pilha(){

            this(10);
        }

        public boolean estaVazia(){
            return tamanho == 0; // retorna valor logico
        }

        public T topo(){
            if(this.estaVazia()){
                return null;
            }
            return elementos[tamanho-1]; // retorna a posição no topo da pilha
        }

        public boolean empilhar(T elemento){
            this.aumentarCapacidade();
            if(tamanho < elementos.length){
                elementos[tamanho] = elemento;
                tamanho++;
                return true;
            }
            return false;

        }

        public T desempilhar(){
            if(this.estaVazia()){
                return null;
            }

            return this.elementos[--tamanho];
        }

        @Override
        public String toString() {

            StringBuilder s = new StringBuilder();
            s.append("[");
            for (int i = 0 ; i < tamanho-1 ; i++){
                s.append(this.elementos[i]);
                s.append(", ");

            }

            if(this.tamanho > 0){
                s.append(this.elementos[tamanho-1]);

            }

            s.append("]");

            return s.toString();

            //return "Pilha [elementos=" + Arrays.toString(elementos) + "]";
        }

        public int tamanho(){
            return tamanho;
        }

        @SuppressWarnings("unchecked")
        private void aumentarCapacidade(){
            if(tamanho == elementos.length){
                T[] elementosNovos = (T[]) new Object[elementos.length*2];
                for (int i = 0; i < elementos.length; i++){
                    elementosNovos[i] = elementos[i];

                }

                elementos = elementosNovos;
            }
        }

}