package br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory;

public class MarcaTwoFactory implements ProdutoFactory {


    @Override
    public Pao criarPao() {
        return new MarcaTwoPao();
    }

    @Override
    public Biscoito criarBiscoito() {
        return new MarcaTwoBiscoito();
    }
}
