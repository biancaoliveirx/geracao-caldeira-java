package ex06;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500.00);

        try {
            conta.sacar(600.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
