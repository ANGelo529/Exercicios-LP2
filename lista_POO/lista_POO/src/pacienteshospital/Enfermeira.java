package pacienteshospital;

//Enfermeira variaveis -> (nome,telefone,salario,horarioTrabalho,pacienteAhMedicar,Medicamento)
public class Enfermeira {
    private String nome;
    private String telefone;
    private float salario;
    private String horarioTrabalho;
    private Paciente pacienteAhMedicar;
    private Medicamento medicamento;

    public Enfermeira() {
    }

    public Enfermeira(String nome, String telefone, float salario, String horarioTrabalho, Paciente pacienteAhMedicar,
            Medicamento medicamento) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.horarioTrabalho = horarioTrabalho;
        this.pacienteAhMedicar = pacienteAhMedicar;
        this.medicamento = medicamento;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public Paciente getPacienteAhMedicar() {
        return pacienteAhMedicar;
    }

    public void setPacienteAhMedicar(Paciente pacienteAhMedicar) {
        this.pacienteAhMedicar = pacienteAhMedicar;
    }
}
