package atvd4;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public double calcularSaldoTotal() {
        double saldoTotal = 0.0;
        for (ContaBancaria conta : contas) {
            saldoTotal += conta.saldo;
        }
        return saldoTotal;
    }
}

