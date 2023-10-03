import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private String horarioAtual;
    private List<String> historicoTransacoes;

    /*Construtor */
    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0;
        this.horarioAtual = getCurrentTime();
        this.historicoTransacoes = new ArrayList<>();
    }

    private String getCurrentTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        return timeFormat.format(now);
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historicoTransacoes.add("Saque de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        historicoTransacoes.add("Deposito de R$ " + valor);
    }

    public void pix(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historicoTransacoes.add("Transferencia de PIX de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }


    public void fecharConta() {
        saldo = 0;
        historicoTransacoes.add("Conta encerrada.");
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + horarioAtual);
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Horário Atual: " + horarioAtual);
    }

    private boolean isHorarioTransferenciaPermitido() {
        String[] parts = horarioAtual.split(":");
        int hour = Integer.parseInt(parts[0]);
        return hour >= 8 && hour <= 19;
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        historicoTransacoes.add("Endereço alterado para: " + novoEndereco);
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public void calcularJuros(double taxa) {
        double juros = saldo * taxa;
        saldo += juros;
        historicoTransacoes.add("Juros calculados: R$ " + juros);
    }
}


