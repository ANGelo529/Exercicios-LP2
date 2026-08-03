package gerenciamentocurso;

//Aluno: variaveis -> (nome,tcc,cpf,endereço,nota,id,email,telefone)
public class Aluno {
    private String nome;
    private String tcc;
    private String cpf;
    private String endereco;
    private char nota;
    private String id;
    private String email;
    private int telefone;

    public Aluno() {
    }

    public Aluno(String nome, String tcc, String cpf, String endereco, char nota, String id, String email,
            int telefone) {
        this.nome = nome;
        this.tcc = tcc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nota = nota;
        this.id = id;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTcc() {
        return tcc;
    }

    public void setTcc(String tcc) {
        this.tcc = tcc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getNota() {
        return nota;
    }

    public void setNota(char nota) {
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
