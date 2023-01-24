package br.edu.ebac.modulo15_Padroes_Projetos.abstractFactory;

public class Diretor {

    ProdutoFactory produtoFactory;


    public void setProdutoFactory(ProdutoFactory produtoFactory) {
        this.produtoFactory = produtoFactory;
    }

    public void getPao() {

        produtoFactory.criarPao().exibirTipo();

    }

    public void getBiscoito() {

        produtoFactory.criarBiscoito().exibirTipo();

    }
}
