package gerenciamentocurso;

//Professor: variaveis -> (nome,graduacao,salario,emailProfissional,id)
public class Professor {
    private String nome;
    private String graduacao;
    private float salario;
    private String emailProfissional;
    private String id;

    public Professor() {
    }

    public Professor(String nome, String graduacao, float salario, String emailProfissional, String id) {
        this.nome = nome;
        this.graduacao = graduacao;
        this.salario = salario;
        this.emailProfissional = emailProfissional;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEmailProfissional() {
        return emailProfissional;
    }

    public void setEmailProfissional(String emailProfissional) {
        this.emailProfissional = emailProfissional;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
