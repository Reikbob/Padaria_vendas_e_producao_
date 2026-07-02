package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.OrdemProducao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdemProducaoDAO {

    public void salvar(OrdemProducao op) {

        String sql =
        "INSERT INTO ordens_producao " +
        "(id_produto, id_colaborador, quantidade_planejada, status) " +
        "VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, op.getIdProduto());
            stmt.setInt(2, op.getIdColaborador());
            stmt.setDouble(3, op.getQuantidadePlanejada());
            stmt.setString(4, op.getStatus());

            stmt.executeUpdate();

            System.out.println("Ordem de Produção aberta!");

        } catch (SQLException e) {

            System.out.println(
            "Erro na OP: " + e.getMessage());

        }
    }
}