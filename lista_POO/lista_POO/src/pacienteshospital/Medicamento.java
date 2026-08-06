package pacienteshospital;

//Medicamento variaveis -> (nomeMedicamento,idFarmacia,indicacesDeUso,contraIndicacoes,fornecedor,materiais)
public class Medicamento {
    private String nomeMedicamento;
    private String idFarmacia;
    private String indicacoesDeUso;
    private String contraIndicacoes;
    private String fornecedor;
    private String materiais;

    public Medicamento() {
    }

    public Medicamento(String nomeMedicamento, String idFarmacia, String indicacoesDeUso, String contraIndicacoes,
            String fornecedor, String materiais) {
        this.nomeMedicamento = nomeMedicamento;
        this.idFarmacia = idFarmacia;
        this.indicacoesDeUso = indicacoesDeUso;
        this.contraIndicacoes = contraIndicacoes;
        this.fornecedor = fornecedor;
        this.materiais = materiais;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public String getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(String idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public String getIndicacoesDeUso() {
        return indicacoesDeUso;
    }

    public void setIndicacoesDeUso(String indicacoesDeUso) {
        this.indicacoesDeUso = indicacoesDeUso;
    }

    public String getContraIndicacoes() {
        return contraIndicacoes;
    }

    public void setContraIndicacoes(String contraIndicacoes) {
        this.contraIndicacoes = contraIndicacoes;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMateriais() {
        return materiais;
    }

    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }
}
