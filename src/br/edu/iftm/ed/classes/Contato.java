package br.edu.iftm.ed.classes;

public class Contato implements Comparable<Contato> {

    private String nomeContato;

    private String telefone;

    public Contato(){

    }

    public Contato (String nomeContato, String telefone){
        this.nomeContato = nomeContato;
        this.telefone = telefone;
    }

    public String getNomeContato(){
        return nomeContato;
    }

    public void setNome(String nomeContato){
        this.nomeContato = nomeContato;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    @Override
    public int compareTo(Contato c) {
        // obj1 > obj2 return > 0 (1)
        // obj1 < obj2 return < 0 (-1)
        // obj1 == obj2 return 0

        int comparedResult = this.nomeContato.compareTo(c.getNomeContato());

        if(comparedResult > 0){
            return 1;
        }else if(comparedResult < 0){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nContato: [ "+nomeContato+" ], Telefone: ["+ telefone +" ]";
    }
}
