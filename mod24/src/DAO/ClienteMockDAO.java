package DAO;

public class ClienteMockDAO implements IClienteDAO {

    @Override
    public String salvar() {
        return "sucesso";
    };

    @Override
    public String buscar() {
        return "sucesso";
    };

    @Override
    public String excluir() {
        return "sucesso";
    };

    @Override
    public String atualizar() {
        return "sucesso";
    };
}
