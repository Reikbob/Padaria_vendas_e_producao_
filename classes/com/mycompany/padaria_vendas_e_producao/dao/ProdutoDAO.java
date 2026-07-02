package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void salvar(Produto p) {

        // O comando SQL agora bate perfeitamente com a tabela do esquema public
        String sql = 
        "INSERT INTO public.produtos " +
        "(nome, categoria, descricao, preco, custo, quantidade_estoque, link_info_web) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Preenchendo os 7 pontos de interrogação com os dados do objeto Java
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCategoria());
            stmt.setString(3, p.getDescricao());
            stmt.setDouble(4, p.getPreco());
            stmt.setDouble(5, p.getCusto());
            stmt.setDouble(6, p.getQuantidadeEstoque());
            stmt.setString(7, p.getLinkInfoWeb());

            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso no banco unificado!");

        } catch (SQLException e) {

            System.out.println("Erro ao salvar produto: " + e.getMessage());

        }
    }

    public Iterable<Produto> listarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}