package br.edu.iftm.ed.classes;

public class Livro {

    private String titulo;
    private String autor;
    private int anoLancamento;
    private String isbn;

    public Livro(String titulo, String autor, int anoLancamento, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
        }

    public String getAutor(){
        return autor;
        }

    public void setAutor(String autor){
        this.autor = autor;
        }

    public int getAnoLancamento(){
        return anoLancamento;
        }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
        }

    public String getIsbn(){
        return isbn;
        }

    public void setIsbn(String isbn){
        this.isbn = isbn;
        }

@Override
        public String toString(){
            return "\n----------------------------------------\n" +
            "- Titulo:" + titulo + '\n'+
            " - Autor: " + autor + '\n' +
            " - Ano de Lançamento: " + anoLancamento + '\n' +
            " - ISBN: " + isbn;
        }


}
