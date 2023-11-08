package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listaDeStrings = Arrays.asList("banana", "maça", "bergamota", "banana", "maça", "bergamota" );

        // contar o numero total de strings
        long totalStrings = listaDeStrings.stream().count();
        System.out.println("Total de strings: " + totalStrings);

        // encontrar a string mais longa
        String maisLonga = listaDeStrings.stream().max((s1, s2) -> s1.length() - s2.length()).orElse(null);
        System.out.println("String mais longa: " + maisLonga);

        // contar quantas vezes cada string aparece na lista e exibir a contagem das 5 strings mais frequentes
        Map<String, Long> frequencia = listaDeStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencia.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(e -> System.out.println("String: " + e.getKey() + ", contagem: " + e.getValue()));
    }
}
