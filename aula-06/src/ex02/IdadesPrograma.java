package ex02;

import java.util.HashMap;
import java.util.Map;

public class IdadesPrograma {
    public static void main(String[] args) {
        Map<String, Integer> nomesEidades = new HashMap<>();

        nomesEidades.put("João", 32);
        nomesEidades.put("Maria", 57);
        nomesEidades.put("Ana", 65);
        nomesEidades.put("Carlos", 80);
        nomesEidades.put("Helena", 70);

        String nomeProcurado = "Maria";
        if (nomesEidades.containsKey(nomeProcurado)) {
            System.out.println(nomeProcurado + " tem " + nomesEidades.get(nomeProcurado) + " anos");
        } else {
            System.out.println("Nome não encontrado");
        }

        imprimirTerceiraIdade(nomesEidades);
    }

    public static void imprimirTerceiraIdade(Map<String, Integer> mapa) {
        System.out.println("\nPessoas na terceira idade: ");
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            if (entrada.getValue() >= 60) {
                System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos");
            }
        }
    }
}
