package gerenciamentocurso;

//Disciplina: variaveis -> (nome,notaDeCorte,horario,avaliacoes,Professor)
public class Disciplina {
    private String nome;
    private int notaDeCorte;
    private float horario;
    private String avaliacoes;
    private Professor professor = new Professor();

    public Disciplina() {
    }

    public Disciplina(String nome, int notaDeCorte, float horario, String avaliacoes, Professor professor) {
        this.nome = nome;
        this.notaDeCorte = notaDeCorte;
        this.horario = horario;
        this.avaliacoes = avaliacoes;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaDeCorte() {
        return notaDeCorte;
    }

    public void setNotaDeCorte(int notaDeCorte) {
        this.notaDeCorte = notaDeCorte;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }

    public String getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(String avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
