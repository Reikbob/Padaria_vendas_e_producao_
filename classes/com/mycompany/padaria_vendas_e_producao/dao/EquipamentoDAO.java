package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipamentoDAO {
    public void salvar(Equipamento eq) {
        String sql = "INSERT INTO equipamentos (nome, descricao, status) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, eq.getNome());
            stmt.setString(2, eq.getDescricao());
            stmt.setString(3, eq.getStatus());
            stmt.executeUpdate();
            System.out.println("Equipamento cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar equipamento: " + e.getMessage());
        }
    }
}