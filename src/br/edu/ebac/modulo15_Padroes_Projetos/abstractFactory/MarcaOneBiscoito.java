package br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory;

public class MarcaOneBiscoito implements Biscoito{


    @Override
    public void exibirTipo() {
        System.out.println("Criou um biscoito da marca ONE");
    }
}
