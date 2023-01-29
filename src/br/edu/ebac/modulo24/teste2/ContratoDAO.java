package br.edu.ebac.modulo24.teste2;

public class ContratoDAO implements IContratoDAO {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Falha ao salvar!");
    }

    @Override
    public void buscar(int id) {

        throw new UnsupportedOperationException("Erro ao buscar!");
    }

    @Override
    public void excluir(int id) {

        throw new UnsupportedOperationException("Erro ao excluir!");
    }

    @Override
    public void atualizar(int id) {

        throw new UnsupportedOperationException("Erro ao atualizar!");
    }
}
