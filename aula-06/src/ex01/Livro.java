package ex01;

public class Livro {
    private  String titulo;
    private  String categoria;


    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livro " + titulo + " categoria " + categoria;
    }
}
