package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {

    public void registrarVenda(Venda v) {

        String sqlVenda =
        "INSERT INTO vendas " +
        "(id_cliente, id_produto, id_colaborador, quantidade, valor_venda) " +
        "VALUES (?, ?, ?, ?, ?)";

        String sqlEstoque =
        "UPDATE produtos " +
        "SET quantidade_estoque = quantidade_estoque - ? " +
        "WHERE id_produto = ?";

        try (Connection conn = Conexao.conectar()) {

            conn.setAutoCommit(false);

            try (
                PreparedStatement stmtV =
                conn.prepareStatement(sqlVenda);

                PreparedStatement stmtE =
                conn.prepareStatement(sqlEstoque)
            ) {

                stmtV.setInt(1, v.getIdCliente());
                stmtV.setInt(2, v.getIdProduto());
                stmtV.setInt(3, v.getIdColaborador());
                stmtV.setDouble(4, v.getQuantidade());
                stmtV.setDouble(5, v.getValorVenda());

                stmtV.executeUpdate();

                stmtE.setDouble(1, v.getQuantidade());
                stmtE.setInt(2, v.getIdProduto());

                stmtE.executeUpdate();

                conn.commit();

                System.out.println("Venda concluída!");

            } catch (SQLException e) {

                conn.rollback();

                throw e;
            }

        } catch (SQLException e) {

            System.out.println(
            "Erro na venda: " + e.getMessage());

        }
    }
}