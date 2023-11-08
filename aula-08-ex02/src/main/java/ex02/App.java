package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Produto 1", 19.99, 5),
                new Produto("Produto 2", 29.99, 15),
                new Produto("Produto 3", 9.99, 20),
                new Produto("Produto 4", 49.99, 7),
                new Produto("Produto 5", 39.99, 12)
        );

        // a) Encontre o produto mais caro na lista.
        Produto maisCaro = produtos.stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null);
        System.out.println("Produto mais caro: " + (maisCaro != null ? maisCaro.getNome() : "nenhum"));

        // b) Calcule o preço total de todos os produtos na lista.
        double precoTotal = produtos.stream()
                .mapToDouble(p -> p.getPreco() * p.getQuantidade())
                .sum();
        System.out.println("Preço total: " + precoTotal);

        // c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.
        List<Produto> filtrados = produtos.stream()
                .filter(p -> p.getQuantidade() > 10)
                .collect(Collectors.toList());
        System.out.println("Produtos com quantidade superior a 10:");
        filtrados.forEach(p -> System.out.println(p.getNome() + " - Quantidade: " + p.getQuantidade()));
    }
}