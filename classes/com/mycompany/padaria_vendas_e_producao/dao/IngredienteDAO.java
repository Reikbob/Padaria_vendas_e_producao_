package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Ingrediente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IngredienteDAO {
    public void salvar(Ingrediente ing) {
        String sql = "INSERT INTO ingredientes (nome, quantidade_estoque, unidade) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ing.getNome());
            stmt.setDouble(2, ing.getQuantidadeEstoque());
            stmt.setString(3, ing.getUnidade());
            stmt.executeUpdate();
            System.out.println("Ingrediente cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar ingrediente: " + e.getMessage());
        }
    }
}