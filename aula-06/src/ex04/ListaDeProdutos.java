package ex04;

import java.util.LinkedHashMap;
import java.util.Map;

public class ListaDeProdutos {
    public static void main(String[] args) {
        Map<String, Double> listaProdutos = new LinkedHashMap<>();

        listaProdutos.put("Arroz", 10.99);
        listaProdutos.put("Feijão", 14.49);
        listaProdutos.put("Macarrão", 2.99);
        listaProdutos.put("Azeite", 19.99);
        listaProdutos.put("Leite", 3.49);

        System.out.println("Lista de produtos: ");
        for (Map.Entry<String, Double> entrada : listaProdutos.entrySet()) {
            System.out.println(entrada.getKey() + ": R$ " + String.format("%.2f", entrada.getValue()));
        }
     }
}
