package pacienteshospital;

import java.util.ArrayList;
import java.util.List;

//------------Linha lógica das classe------------
//Quarto -> Paciente;Enfermeira
//Paciente -> MedicoResponsavel
//MedicoResponsavel -> Medicamento

//------------Variaveis das classe------------
//Quarto variaveis -> (numQuarto,qtdPacientes,Paciente,Enfermeira)
//Paciente variaveis -> (nome,doenca,telefone,contatoResponsave,avalicaoMedica,MedicoResponsavel)
//Enfermeira variaveis -> (nome,telefone,salario,horarioTrabalho,pacienteAhMedicar,Medicamento)
//MedicoResponsavel variaveis -> (nome,telefone,horariosAhMedicar,salario,formacao,Medicamento)
//Medicamento variaveis -> (nomeMedicamento,idFarmacia,indicacesDeUso,contraIndicacoes,fornecedor,materiais)

public class Quarto {
    private int numQuarto;
    private int qtdPacientes;
    private List<Paciente> paciente = new ArrayList<Paciente>();
    private List<Enfermeira> enfermeira = new ArrayList<Enfermeira>();

    public Quarto() {
    }

    public Quarto(int numQuarto, int qtdPacientes, List<Paciente> paciente, List<Enfermeira> enfermeira) {
        this.numQuarto = numQuarto;
        this.qtdPacientes = qtdPacientes;
        this.paciente = paciente;
        this.enfermeira = enfermeira;
    }

    public int getnumQuarto() {
        return numQuarto;
    }

    public void setnumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public int getQtdPacientes() {
        return qtdPacientes;
    }

    public void setQtdPacientes(int qtdPacientes) {
        this.qtdPacientes = qtdPacientes;
    }

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    public List<Enfermeira> getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(List<Enfermeira> enfermeira) {
        this.enfermeira = enfermeira;
    }
}
