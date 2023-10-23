package ex04;

public class Produto {
    private String nome;
    private String validade;
    private double preco;

    public Produto(String nome, String validade, double preco) {
        this.nome = nome;
        this.validade = validade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + ", data de validade: " + validade + ", custa: " + preco;
    }
}
