package ex06;

public class Reserva {
    private String nome;
    private String local;
    private String cpf;
    private String dataEntrada;
    private String dataSaida;

    public Reserva(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Reserva: " + nome + ", local: " + local + "cpf: " + cpf + ", Data de Entrada: " + dataEntrada + ", Data de Saída: " + dataSaida;
    }
}
