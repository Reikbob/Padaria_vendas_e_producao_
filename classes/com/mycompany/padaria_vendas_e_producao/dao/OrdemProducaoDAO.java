package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.OrdemProducao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdemProducaoDAO {
    public void salvar(OrdemProducao op) {
        String sql = "INSERT INTO ordem_producao (id_produto, id_colaborador, status, quantidade_planejada) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, op.getIdProduto());
            stmt.setInt(2, op.getIdColaborador());
            stmt.setString(3, op.getStatus());
            stmt.setDouble(4, op.getQuantidadePlanejada());
            stmt.executeUpdate();
            System.out.println("Ordem de produção cadastrada!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar ordem de produção: " + e.getMessage());
        }
    }
}