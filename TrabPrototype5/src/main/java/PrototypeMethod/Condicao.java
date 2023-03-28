package PrototypeMethod;

public class Condicao implements Cloneable {
    private String umidadeSolo;
    private Integer ph;

    public Condicao(String umidadeSolo, Integer ph) {
        super();
        this.umidadeSolo = umidadeSolo;
        this.ph = ph;
    }

    public String getUmidadeSolo() {
        return umidadeSolo;
    }

    public void setUmidadeSolo(String umidadeSolo) {
        this.umidadeSolo = umidadeSolo;
    }

    public Integer getPh() {
        return ph;
    }

    public void setPh(Integer ph) {
        this.ph = ph;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Condicao{" +
                "Umidade do solo='" + umidadeSolo + '\'' +
                ", Ph do solo=" + ph +
                '}';
    }
}