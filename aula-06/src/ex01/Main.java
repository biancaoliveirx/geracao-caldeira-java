package ex01;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Livro> pilhaLivros = new Stack<>();

        pilhaLivros.push(new Livro("Dom Casmurro", "Romance"));
        pilhaLivros.push(new Livro("O pequeno principe", "Fantasia"));
        pilhaLivros.push(new Livro("1984", "ficção cientifica"));
        pilhaLivros.push(new Livro("A arte da guerra", "filosofia"));
        pilhaLivros.push(new Livro("A divina comedia", "Poesia"));

        System.out.println("Todos os livrcos na pilha:");
        for (Livro livro : pilhaLivros) {
            System.out.println(livro);
        }

        String categoriaProcurada = "Fatmasia";
        System.out.println("\nLivros da categoria " + categoriaProcurada);
        for (Livro livro : pilhaLivros) {
            if (livro.getCategoria().equals(categoriaProcurada)) {
                System.out.println(livro);
            }
        }

        System.out.println("\nRemovendo livros da pilha: ");
        while (!pilhaLivros.isEmpty()) {
            Livro livroRemovido = pilhaLivros.pop();
            System.out.println("Livro removido: " + livroRemovido);
        }
    }
}
