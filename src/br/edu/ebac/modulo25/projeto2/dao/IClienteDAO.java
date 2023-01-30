package br.edu.ebac.modulo25.projeto2.dao;

import br.edu.ebac.modulo25.projeto2.domain.Cliente;

public interface IClienteDAO {
    Boolean salvar(Cliente cliente);

     Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);


}
