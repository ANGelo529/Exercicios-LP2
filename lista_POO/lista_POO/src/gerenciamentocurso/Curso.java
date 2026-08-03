package gerenciamentocurso;

//------------Linha lógica das classe------------
//Curso -> Disciplina, Turma
//Disciplina-> Professor
//Turma-> Aluno

//------------Variaveis das classe------------
//Curso: variaveis -> (nome,tipoDeFormacao,cargaHoraria,qtdSemestre,qtdTurmas,Turma)
//Turma: variaveis -> (sala,semestre,ano,qtdAlunos,Aluno)
//Aluno: variaveis -> (nome,tcc,cpf,endereço,nota,id,email,telefone)
//Disciplina: variaveis -> (nome,notaDeCorte,horario,avaliacoes,Professor)
//Professor: variaveis -> (nome,graduacao,salario,emailProfissional,id)

public class Curso {
    private String nome;
    private String tipoDeFormacao;
    private int cargaHoraria;
    private int qtdSemestres;
    private int qtdTurmas;
    private int qtdDisciplina;
    private Turma[] turma = new Turma[qtdTurmas];
    private Disciplina[] disciplina = new Disciplina[qtdDisciplina];

    public Curso() {
    }

    public Curso(String nome, String tipoDeFormacao, int cargaHoraria, int qtdSemestres, int qtdTurmas,
            int qtdDisciplina, Disciplina[] disciplina, Turma[] turma) {
        this.nome = nome;
        this.tipoDeFormacao = tipoDeFormacao;
        this.cargaHoraria = cargaHoraria;
        this.qtdSemestres = qtdSemestres;
        this.qtdTurmas = qtdTurmas;
        this.qtdDisciplina = qtdDisciplina;
        this.disciplina = disciplina;
        this.turma = turma;
    }

    public int getQtdSemestres() {
        return qtdSemestres;
    }

    public void setQtdSemestres(int qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }

    public int getQtdDisciplina() {
        return qtdDisciplina;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeFormacao() {
        return tipoDeFormacao;
    }

    public void setTipoDeFormacao(String tipoDeFormacao) {
        this.tipoDeFormacao = tipoDeFormacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQtdSemestre() {
        return qtdSemestres;
    }

    public void setQtdSemestre(int qtdSemestres) {
        this.qtdSemestres = qtdSemestres;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    public Turma[] getTurma() {
        return turma;
    }

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }
}
