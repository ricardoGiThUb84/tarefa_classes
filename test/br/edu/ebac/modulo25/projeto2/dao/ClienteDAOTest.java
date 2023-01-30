package br.edu.ebac.modulo25.projeto2.dao;

import br.edu.ebac.modulo25.projeto2.domain.Cliente;
import br.edu.ebac.modulo25.projeto2.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteDAOTest {

    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        this.clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() {

        cliente = new Cliente();
        cliente.setCpf(12345678912L);
        cliente.setNome("Ricardo");
        cliente.setCidade("Salvador");
        cliente.setEnd("Rua do código");
        cliente.setEstado("BA");
        cliente.setNumero(6);
        cliente.setNumero(2345678);

        clienteDAO.salvar(cliente);


    }

    @Test
    public void pesquisarCliente() {


        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void excluirCliente() {

        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Ricardo Silva");
        clienteDAO.alterar(cliente);

    }

}