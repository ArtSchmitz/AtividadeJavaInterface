package atvd3;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Getters e Setters
    
    public abstract void marcarConsulta();
    
    public abstract void receberTratamento();
}

