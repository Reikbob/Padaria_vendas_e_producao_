package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.ItemVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemVendaDAO {
    public void salvar(ItemVenda iv) {
        String sql = "INSERT INTO itens_venda (id_venda, id_produto, quantidade, subtotal) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, iv.getIdVenda());
            stmt.setInt(2, iv.getIdProduto());
            stmt.setDouble(3, iv.getQuantidade());
            stmt.setDouble(4, iv.getSubtotal());
            stmt.executeUpdate();
            System.out.println("Item de venda cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar item de venda: " + e.getMessage());
        }
    }
}