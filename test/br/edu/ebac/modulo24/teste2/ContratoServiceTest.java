package br.edu.ebac.modulo24.teste2;

import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {

        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        String valorEsperado = "Salvo com sucesso!";

        Assert.assertEquals(valorEsperado, retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroAoSalvarBancoDados() {

        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();


    }

    @Test
    public void buscarTest() {

        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.buscar(id);
        String valorEsperado = "Retorno Contrato!";

        Assert.assertEquals(valorEsperado, retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroAoBuscarNoBancoDados() {

        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.buscar(id);
        String valorEsperado = "Retorno Contrato!";

        Assert.assertEquals(valorEsperado, retorno);
    }

    @Test
    public void excluirTest() {

        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.excluir(id);
        String valorEsperado = "Contrato Excluído!";

        Assert.assertEquals(valorEsperado, retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroAoExcluirNoBancoDados() {

        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.excluir(id);
        String valorEsperado = "Contrato Excluído!";

        Assert.assertEquals(valorEsperado, retorno);

    }


    @Test
    public void atualizarTest() {

        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.atualizar(id);
        String valorEsperado = "Contrato atualizado!";

        Assert.assertEquals(valorEsperado, retorno);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroAoatualizarTest() {

        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        int id = 1;
        String retorno = service.atualizar(id);
        String valorEsperado = "Contrato atualizado!";

        Assert.assertEquals(valorEsperado, retorno);

    }
}
