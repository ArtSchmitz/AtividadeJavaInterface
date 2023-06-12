package atvd3;

public class Medico extends Pessoa {
    public Medico(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    
    @Override
    public void marcarConsulta() {
    }
    
    @Override
    public void receberTratamento() {
    }
}
