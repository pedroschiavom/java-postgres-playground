package com.example;


import java.sql.Connection;
import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.model.Marca;
import com.example.model.Produto;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;


public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd(){
        try(var conn = ConnectionManager.getConnection()){ 
        var estadoDAO = new EstadoDAO(conn);
        estadoDAO.listar();
        estadoDAO.localizar("SP");
       
        var marca = new Marca();
        marca.setId(2L);

        var produto = new Produto();
        produto.setId(204L);
        produto.setMarca(marca);
        produto.setNome("Produto Novo");
        produto.setValor(90);

        var produtoDAO = new ProdutoDAO(conn);
        
        produtoDAO.alterar(produto);
        produtoDAO.excluir(205);

        var dao = new DAO(conn);
        dao.listar("produto");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    } 

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e ) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados");
        }
    }
}
