package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.EtapaProducao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EtapaProducaoDAO {
    public void salvar(EtapaProducao ep) {
        String sql = "INSERT INTO etapa_producao (id_ordem_producao, nome_etapa, status, id_equipamento, id_colaborador) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ep.getIdOrdemProducao());
            stmt.setString(2, ep.getNomeEtapa());
            stmt.setString(3, ep.getStatus());
            stmt.setInt(4, ep.getIdEquipamento());
            stmt.setInt(5, ep.getIdColaborador());
            stmt.executeUpdate();
            System.out.println("Etapa de produção cadastrada!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar etapa: " + e.getMessage());
        }
    }
}