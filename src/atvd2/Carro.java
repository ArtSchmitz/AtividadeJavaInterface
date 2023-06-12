package atvd2;

public class Carro implements Veiculo {
    @Override
    public void alugar() {
        System.out.println("Alugando um carro...");
    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo um carro...");
    }
}
