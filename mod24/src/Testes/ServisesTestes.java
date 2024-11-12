package Testes;

import DAO.ClienteDAO;
import DAO.ClienteMockDAO;
import DAO.IClienteDAO;
import Services.ClienteServices;
import org.junit.Assert;
import org.junit.Test;

public class ServisesTestes {

    @Test
    public void salvarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.salvar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void salvarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.salvar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void buscarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.buscar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void buscarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.buscar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void excluirTest(){
        IClienteDAO dao = new ClienteMockDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.excluir();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void excluirTestErro(){
        IClienteDAO dao = new ClienteDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.excluir();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test
    public void atualizarTest(){
        IClienteDAO dao = new ClienteMockDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.atualizar();
        Assert.assertEquals("sucesso", resposta);
    }

    @Test(expected = UnsupportedOperationException.class )
    public void atualizarTestErro(){
        IClienteDAO dao = new ClienteDAO();
        ClienteServices clienteservises = new ClienteServices(dao);
        String resposta = clienteservises.atualizar();
        Assert.assertEquals("sucesso", resposta);
    }
}
