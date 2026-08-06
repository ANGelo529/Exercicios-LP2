package pacienteshospital;

//Paciente variaveis -> (nome,doenca,telefone,contatoResponsave,avalicaoMedica,MedicoResponsavel)
public class Paciente {
    private String nome;
    private String doenca;
    private String telefone;
    private String contatoResponsavel;
    private String avaliacaoMedica;
    private MedicoResponsavel MedicoResponsavel = new MedicoResponsavel();

    public Paciente() {
    }

    public Paciente(String nome, String doenca, String telefone, String contatoResponsavel, String avaliacaoMedica,
            pacienteshospital.MedicoResponsavel medicoResponsavel) {
        this.nome = nome;
        this.doenca = doenca;
        this.telefone = telefone;
        this.contatoResponsavel = contatoResponsavel;
        this.avaliacaoMedica = avaliacaoMedica;
        MedicoResponsavel = medicoResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(String contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }

    public String getAvaliacaoMedica() {
        return avaliacaoMedica;
    }

    public void setAvaliacaoMedica(String avaliacaoMedica) {
        this.avaliacaoMedica = avaliacaoMedica;
    }

    public MedicoResponsavel getMedicoResponsavel() {
        return MedicoResponsavel;
    }

    public void setMedicoResponsavel(MedicoResponsavel medicoResponsavel) {
        MedicoResponsavel = medicoResponsavel;
    }
}
