package Testes;

import DAO.ClienteDAO;
import DAO.ClienteMockDAO;
import DAO.IClienteDAO;
import org.junit.Assert;
import org.junit.Test;

public class ClienteDaoTestes {
    @Test
    public void salvarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        String resposta = dao.salvar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void buscarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        String resposta = dao.buscar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void excluirTest(){
        IClienteDAO dao = new ClienteMockDAO();
        String resposta = dao.excluir();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void atualizarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        String resposta = dao.atualizar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void salvarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        String resposta = dao.salvar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void buscarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        String resposta = dao.buscar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void excluirTestErro(){
        IClienteDAO dao = new ClienteDAO();
        String resposta = dao.excluir();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void atualizarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        String resposta = dao.atualizar();
        Assert.assertEquals("sucesso", resposta);
    }
}
