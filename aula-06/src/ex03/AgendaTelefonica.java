package ex03;

import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {

    static class Contato {
       String numeroTelefone;
       String nome;
       String endereco;
       String localCidade;

       Contato(String numeroTelefone, String nome, String endereco, String localCidade) {
           this.numeroTelefone = numeroTelefone;
           this.nome = nome;
           this.endereco = endereco;
           this.localCidade = localCidade;
       }

       @Override
        public String toString() {
           return "Contato" + numeroTelefone + " nome: " + nome + " endereço: " + endereco + " local da cidade: " + localCidade;
       }
    }

    public static void main(String[] args) {
        Map<String, Contato> agenda = new TreeMap<>();

        agenda.put("João", new Contato("1234-5678", "João", "Rua das Flores, 10", "norte"));
        agenda.put("Maria", new Contato("2345-6789", "Maria", "Av. Brasil, 500", "centro"));
        agenda.put("Carlos", new Contato("3456-7890", "Carlos", "Rua da Paz, 250", "leste"));
        agenda.put("Ana", new Contato("4567-8901", "Ana", "Rua das Árvores, 750", "sul"));

        System.out.println("Lista de contatos (Ordem Alfabética): ");
        for (Contato contato : agenda.values()) {
            System.out.println(contato);
        }

        System.out.println("\nContatos por local 'norte': ");
        imprimirContatosPorLocalidade(agenda, "norte");
    }

    public static void imprimirContatosPorLocalidade(Map<String, Contato> agenda, String localidade) {
        for (Contato contato : agenda.values()) {
            if (contato.localCidade.equalsIgnoreCase(localidade)) {
                System.out.println(contato);
            }
        }
    }
}
