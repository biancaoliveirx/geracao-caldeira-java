package ex06;

import ex05.SistemaImpressao;

import java.util.LinkedList;

public class SistemaReservas {
    private LinkedList<Reserva> reservas;

    public SistemaReservas() {
        this.reservas = new LinkedList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva adicionada com sucesso!");
    }

    public void cancelarReserva (String cpf) {
        Reserva reservaParaCancelar = null;
        for (Reserva reserva : reservas) {
            if (reserva.getCpf().equals(cpf)) {
                reservaParaCancelar = reserva;
                break;
            }
        }
        if (reservaParaCancelar != null) {
            reservas.remove(reservaParaCancelar);
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("Reserva não encontrada para o CPF informado.");
        }
    }

    public void exibirReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Não há reservas cadastradas.");
        } else {
            System.out.println("Lista de Reservas: ");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}
