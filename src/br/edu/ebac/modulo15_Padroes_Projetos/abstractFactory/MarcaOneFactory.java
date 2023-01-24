package br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory;

public class MarcaOneFactory implements ProdutoFactory{





    @Override
    public Pao criarPao() {
        return new MarcaOnePao();
    }

    @Override
    public Biscoito criarBiscoito() {
        return new MarcaOneBiscoito();
    }
}
