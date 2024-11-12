package Services;

import DAO.IClienteDAO;

public class ClienteServices implements IClienteServices {

    IClienteDAO clientedao;

    public ClienteServices(IClienteDAO dao ){
        clientedao = dao;
    }


    @Override
    public String salvar() {
        return clientedao.salvar();
    };

    @Override
    public String buscar() {
        return clientedao.buscar();
    };

    @Override
    public String excluir() {
        return clientedao.excluir();
    };

    @Override
    public String atualizar() {
        return clientedao.atualizar();
    };


}
