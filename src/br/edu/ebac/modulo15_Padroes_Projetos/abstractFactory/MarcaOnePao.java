package br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory;

public class MarcaOnePao implements Pao{


    @Override
    public void exibirTipo() {
        System.out.println("Criou um pao da marca ONE");
    }
}
