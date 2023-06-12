package atvd1;

import java.util.ArrayList;
import java.util.List;

interface Hospede {
    void fazerReserva();
    void pagarConta();
}

class HospedeRegular implements Hospede {
    @Override
    public void fazerReserva() {
        System.out.println("Reservando quarto padrão para hóspede regular...");
    }

    @Override
    public void pagarConta() {
        System.out.println("Realizando pagamento da conta para hóspede regular...");
    }
}

class HospedeNegocios implements Hospede {
    @Override
    public void fazerReserva() {
        System.out.println("Reservando quarto executivo para hóspede de negócios...");
    }

    @Override
    public void pagarConta() {
        System.out.println("Realizando pagamento da conta para hóspede de negócios...");
    }
}

class Hotel {
    private List<Hospede> reservas;

    public Hotel() {
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Hospede hospede) {
        reservas.add(hospede);
        System.out.println("Reserva adicionada para um hóspede.");
    }

    public void removerReserva(Hospede hospede) {
        reservas.remove(hospede);
        System.out.println("Reserva removida para um hóspede.");
    }

    public void gerenciarReservas() {
        System.out.println("Gerenciando as reservas do hotel...");
        for (Hospede hospede : reservas) {
            hospede.fazerReserva();
            hospede.pagarConta();
        }
    }
}

class SistemaGerenciamentoReservas {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Hospede hospedeRegular = new HospedeRegular();
        Hospede hospedeNegocios = new HospedeNegocios();

        hotel.adicionarReserva(hospedeRegular);
        hotel.adicionarReserva(hospedeNegocios);

        hotel.gerenciarReservas();
    }
}


