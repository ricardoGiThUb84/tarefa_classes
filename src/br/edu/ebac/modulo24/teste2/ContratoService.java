package br.edu.ebac.modulo24.teste2;

public class ContratoService implements IContratoService {

    IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO dao) {

        this.contratoDAO = dao;
    }



    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Salvo com sucesso!";
    }

    @Override
    public String buscar(int id) {
        contratoDAO.buscar(id);
        return "Retorno Contrato!";
    }

    @Override
    public String excluir(int id) {
        contratoDAO.excluir(id);
        return "Contrato Excluído!";
    }

    @Override
    public String atualizar(int id) {
        contratoDAO.atualizar(id);
        return "Contrato atualizado!";
    }
}
