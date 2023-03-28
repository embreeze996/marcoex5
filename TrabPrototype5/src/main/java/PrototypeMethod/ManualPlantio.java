package PrototypeMethod;

public class ManualPlantio implements Cloneable {
    private String estacao;
    private String especie;
    private Condicao condicao;
    private String tipoSolo;

    public ManualPlantio(String estacao, String especie, Condicao umidade) {
        this.estacao = estacao;
        this.especie = especie;
        this.condicao = condicao;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setUmidade(Condicao umidade) {
        this.condicao = umidade;
    }

    @Override
    public ManualPlantio clone() throws CloneNotSupportedException {
        ManualPlantio manualClone = (ManualPlantio) super.clone();
        manualClone.condicao = (Condicao) manualClone.condicao.clone();
        return manualClone;
    }

    @Override
    public String toString() {
        return "ManualPlantio{" +
                "Estação=" + estacao +
                ", Espécie='" + especie + '\'' +
                ", Condição=" + condicao +
                '}';
    }
}