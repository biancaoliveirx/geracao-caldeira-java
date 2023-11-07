package ex06;

public class ContaBancaria {
    private double saldo;

    public  ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
    }

    //Metodo para deposito para facilitar a manipulação do saldo durante os testes
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("O valor de depósito deve ser positivo");
        }
    }
}
