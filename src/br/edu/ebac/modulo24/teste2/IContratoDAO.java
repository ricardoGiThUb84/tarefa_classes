package br.edu.ebac.modulo24.teste2;

public interface IContratoDAO {
    void salvar();

    void buscar(int id);

    void excluir(int id);

    void atualizar(int id);
}
