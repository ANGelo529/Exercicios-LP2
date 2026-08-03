package gerenciamentocurso;

//Turma: variaveis -> (sala,semestre,ano,qtdAlunos,Aluno)
class Turma {
    private String sala;
    private int semestre;
    private int ano;
    private int qtdAlunos;
    private Aluno[] aluno = new Aluno[qtdAlunos];

    public Turma() {
    }

    public Turma(String sala, int semestre, int ano, int qtdAlunos, Aluno[] aluno) {
        this.sala = sala;
        this.semestre = semestre;
        this.ano = ano;
        this.qtdAlunos = qtdAlunos;
        this.aluno = aluno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
}
