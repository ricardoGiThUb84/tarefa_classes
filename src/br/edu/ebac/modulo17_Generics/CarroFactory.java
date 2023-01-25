package br.edu.ebac.modulo17_Generics;

public class CarroFactory {

    private static CarroFactory carroFactory;

    private CarroFactory() {}

    public static CarroFactory fabricaCarros(){

        if(carroFactory == null) carroFactory = new CarroFactory();

        return carroFactory;
    }


    public Carro getCarro(String marca, String chassi) {

        for (CarBrands tipo: CarBrands.values()) {

            Carro car = tipo.getCarro();
          if(tipo.getMarca().equalsIgnoreCase(marca)){
              car.setModelo(marca);
              car.setChassi(chassi);
              return car;
            }
        }

        Carro car = new Carro();
        car.setChassi(chassi);
        car.setModelo(marca);

        return car;

    }
}
