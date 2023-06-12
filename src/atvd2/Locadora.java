package atvd2;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> veiculos;

    public Locadora() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void alugarVeiculo(Veiculo veiculo) {
        veiculo.alugar();
    }

    public void devolverVeiculo(Veiculo veiculo) {
        veiculo.devolver();
    }
}

