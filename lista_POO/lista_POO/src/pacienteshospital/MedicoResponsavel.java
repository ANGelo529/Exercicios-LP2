package pacienteshospital;

//MedicoResponsavel variaveis -> (nome,telefone,horariosAhMedicar,salario,formacao,Medicamento)
public class MedicoResponsavel {
    private String nome;
    private String telefone;
    private String horariosAhMedicar;
    private float salario;
    private String formacao;
    private Medicamento medicamento = new Medicamento();

    public MedicoResponsavel() {
    }

    public MedicoResponsavel(String nome, String telefone, String horariosAhMedicar, float salario, String formacao,
            Medicamento medicamento) {
        this.nome = nome;
        this.telefone = telefone;
        this.horariosAhMedicar = horariosAhMedicar;
        this.salario = salario;
        this.formacao = formacao;
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

    public String getHorariosAhMedicar() {
        return horariosAhMedicar;
    }

    public void setHorariosAhMedicar(String horariosAhMedicar) {
        this.horariosAhMedicar = horariosAhMedicar;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
