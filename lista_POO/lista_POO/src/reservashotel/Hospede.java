package reservashotel;

//Hospede váriaveis -> (nome,sobrenome,cpf,telefone,checkIn,checkOut,pessoaPQuarto,qtdQuartos)
public class Hospede {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String checkIn;
    private String checkOut;
    private int pessoaPQuarto;
    private int qtdQuartos;

    public Hospede() {
    }

    public Hospede(String nome, String sobrenome, String cpf, String telefone, String checkIn, String checkOut,
            int pessoaPQuarto, int qtdQuartos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pessoaPQuarto = pessoaPQuarto;
        this.qtdQuartos = qtdQuartos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getPessoaPQuarto() {
        return pessoaPQuarto;
    }

    public void setPessoaPQuarto(int pessoaPQuarto) {
        this.pessoaPQuarto = pessoaPQuarto;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

}
