package ex04;

import java.util.HashMap;
import java.util.Map;

public class ListaCompras {

    private String nome;
    private String validade;
    private Map<String, Double> preco = new HashMap<>();
    private static double custoTotal = 0;

    public ListaCompras(String nome, String validade, HashMap preco, double custoTotal) {
        this.nome = nome;
        this.validade = validade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Map<String, Double> getPreco() {
        return preco;
    }

    public void setPreco(Map<String, Double> preco) {
        this.preco = preco;
    }

    public static double getCustoTotal() {
        return custoTotal;
    }

    public static void setCustoTotal(double custoTotal) {
        ListaCompras.custoTotal = custoTotal;
    }

    @Override
    public String toString () {return nome + " , data de validade: " + validade + "custa: " + preco;}

    public boolean atualizarCustoTotal () {
        if (preco == null) {
            return false;
        }
        for (double valor : preco.values()) {
            custoTotal += valor;
        }
        return true;
    }

}
