package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {
    public void salvar(Venda v) {
        String sql = "INSERT INTO vendas (id_cliente, id_produto, id_colaborador, quantidade, valor_venda) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, v.getIdCliente());
            stmt.setInt(2, v.getIdProduto());
            stmt.setInt(3, v.getIdColaborador());
            stmt.setDouble(4, v.getQuantidade());
            stmt.setDouble(5, v.getValorVenda());
            stmt.executeUpdate();
            System.out.println("Venda cadastrada!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar venda: " + e.getMessage());
        }
    }
}