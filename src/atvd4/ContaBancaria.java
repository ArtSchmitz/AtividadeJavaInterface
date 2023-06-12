package atvd4;

public abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;
    protected String titularConta;

    public ContaBancaria(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}

