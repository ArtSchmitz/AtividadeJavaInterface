package atvd2;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        locadora.adicionarVeiculo(carro);
        locadora.adicionarVeiculo(moto);

        locadora.alugarVeiculo(carro);
        locadora.devolverVeiculo(carro);

        locadora.alugarVeiculo(moto);
        locadora.devolverVeiculo(moto);
    }
}

