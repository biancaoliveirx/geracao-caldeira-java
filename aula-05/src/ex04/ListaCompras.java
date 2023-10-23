package ex04;


import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
   private List<Produto> produtos;

   public ListaCompras() {
       this.produtos = new ArrayList<>();
   }

   public void adicionarProduto(Produto produto) {
       this.produtos.add(produto);
   }

   public double calcularCustoTotal() {
       double custoTotal = 0;
       for (Produto produto : produtos) {
           custoTotal += produto.getPreco();
       }
       return custoTotal;
   }

   @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       for (Produto produto : produtos) {
           stringBuilder.append(produto.toString()).append("\n");
       }
       return stringBuilder.toString();
   }
}
