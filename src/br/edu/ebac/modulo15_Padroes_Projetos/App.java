package br.edu.ebac.modulo15_Padroes_Projetos;

import br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory.Diretor;
import br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory.MarcaOneFactory;
import br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory.MarcaTwoFactory;

public class App {

    public static void main(String[] args) {

       //"Classe que irá coordenar a criação dos objetos";
        Diretor diretor = new Diretor();
        //"Método cuja função é mudar a implementação da instrução de qual objeto criar"
        diretor.setProdutoFactory(new MarcaOneFactory());


//        "Métodos voltados para abstração sendo indiferente a implementação."
        diretor.getPao();
        diretor.getBiscoito();

        System.out.println("------------------------------------------------");

        diretor.setProdutoFactory(new MarcaTwoFactory());

        diretor.getPao();
        diretor.getBiscoito();

    }
}
