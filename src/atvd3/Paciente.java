package atvd3;

public class Paciente extends Pessoa {
    public Paciente(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    
    @Override
    public void marcarConsulta() {
    }
    
    @Override
    public void receberTratamento() {
    }
}
