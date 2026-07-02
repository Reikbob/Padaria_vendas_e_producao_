package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Pagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDAO {
    public void salvar(Pagamento pag) {
        String sql = "INSERT INTO pagamentos (id_venda, forma_pagamento, valor_pago, troco) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pag.getIdVenda());
            stmt.setString(2, pag.getFormaPagamento());
            stmt.setDouble(3, pag.getValorPago());
            stmt.setDouble(4, pag.getTroco());
            stmt.executeUpdate();
            System.out.println("Pagamento cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar pagamento: " + e.getMessage());
        }
    }
}