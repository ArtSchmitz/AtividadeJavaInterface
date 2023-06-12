package atvd4;

public class ContaPoupanca extends ContaBancaria {
    private int saquesRestantes;

    public ContaPoupanca(int numeroConta, double saldo, String titularConta, int saquesRestantes) {
        super(numeroConta, saldo, titularConta);
        this.saquesRestantes = saquesRestantes;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saquesRestantes > 0) {
            saldo -= valor;
            saquesRestantes--;
        } else {
            System.out.println("Limite de saques atingido.");
        }
    }
}
