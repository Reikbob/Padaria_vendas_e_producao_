package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReceitaDAO {
    public void salvar(Receita rec) {
        String sql = "INSERT INTO receitas (id_produto, id_ingrediente, quantidade_ingrediente) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, rec.getIdProduto());
            stmt.setInt(2, rec.getIdIngrediente());
            stmt.setDouble(3, rec.getQuantidadeIngrediente());
            stmt.executeUpdate();
            System.out.println("Receita cadastrada!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar receita: " + e.getMessage());
        }
    }
}