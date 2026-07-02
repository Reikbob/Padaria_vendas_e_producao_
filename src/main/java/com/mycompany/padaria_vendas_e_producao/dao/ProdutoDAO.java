package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void salvar(Produto p) {

        String sql =
        "INSERT INTO produtos " +
        "(nome, preco, quantidade_estoque) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setDouble(3, p.getQuantidadeEstoque());

            stmt.executeUpdate();

            System.out.println("Produto cadastrado!");

        } catch (SQLException e) {

            System.out.println(
            "Erro ao salvar produto: " + e.getMessage());

        }
    }

    public Iterable<Produto> listarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}