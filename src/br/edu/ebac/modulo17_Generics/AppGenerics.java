package br.edu.ebac.modulo17_Generics;

public class AppGenerics {

    public static void main(String[] args) {

        CarroFactory fabrica = CarroFactory.fabricaCarros();

       Carro car1 = fabrica.getCarro("toyota", "123454");
       Carro car2 = fabrica.getCarro("honda", "1234546");

       RepoCarroList<Carro> repo = new RepoCarroList<>();

       repo.adicionar(car1);
       repo.adicionar(car2);

        final Carro buscar = repo.buscar(car2);

        System.out.println(buscar);


    }
}
