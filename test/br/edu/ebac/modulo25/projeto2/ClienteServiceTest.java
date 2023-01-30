package br.edu.ebac.modulo25.projeto2;

import br.edu.ebac.modulo25.projeto2.domain.Cliente;
import br.edu.ebac.modulo25.projeto2.dao.ClienteDAOMock;
import br.edu.ebac.modulo25.projeto2.services.ClienteService;
import br.edu.ebac.modulo25.projeto2.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {

        this.clienteService = new ClienteService(new ClienteDAOMock());
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


    }

    @Test
    public void pesquisarCliente() {


        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }

    @Test
    public void salvarCliente() {

        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);

    }

    @Test
    public void excluirCliente() {

        clienteService.excluir(cliente.getCpf());

//        Assert.assertTrue(retorno);

    }

    @Test
    public void alterarCliente() {

        cliente.setNome("Ricardo Silva");

        clienteService.alterar(cliente);

        Assert.assertEquals("Ricardo Silva",cliente.getNome());

    }
}
