package br.edu.ebac.modulo25.projeto2.services;

import br.edu.ebac.modulo25.projeto2.dao.IClienteDAO;
import br.edu.ebac.modulo25.projeto2.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {

        return  clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {

        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {

        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
