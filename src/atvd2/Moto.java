package atvd2;

public class Moto implements Veiculo {
    @Override
    public void alugar() {
        System.out.println("Alugando uma moto...");
    }

    @Override
    public void devolver() {
        System.out.println("Devolvendo uma moto...");
    }
}
