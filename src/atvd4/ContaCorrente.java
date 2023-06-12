package atvd4;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(int numeroConta, double saldo, String titularConta, double limite) {
        super(numeroConta, saldo, titularConta);
        this.limite = limite;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
