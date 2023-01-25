package br.edu.ebac.modulo17_Generics;

public enum CarBrands {

    HONDA("Honda" ,  new Honda()),
    TOYOTA("Toyota" , new Toyota());

    private  String marca;
    private Carro carro;

    CarBrands(String marca,  Carro carro) {
        this.marca = marca;
        this.carro = carro;
    }

    public String getMarca() {
        return marca;
    }



    public Carro getCarro() {
        return carro;
    }
}
