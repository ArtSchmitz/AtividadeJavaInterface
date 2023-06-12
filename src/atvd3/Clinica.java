package atvd3;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    
    public Clinica() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
    }
    
    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    
    public void removerPaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }
    
    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }
    
    public void removerMedico(Medico medico) {
        medicos.remove(medico);
    }
    
    public void gerenciarHorariosConsulta(Medico medico) {
    }
}
