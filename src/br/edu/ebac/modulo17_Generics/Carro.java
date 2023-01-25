package br.edu.ebac.modulo17_Generics;

public class Carro {

    protected String modelo;

    protected String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public boolean equals(Object obj) {

        return ((Carro) obj).getChassi().equalsIgnoreCase(this.getChassi());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                '}';
    }
}
