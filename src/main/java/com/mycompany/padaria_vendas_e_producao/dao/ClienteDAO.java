package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    
    public void salvar(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpf, telefone) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexao.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            
            stmt.executeUpdate();
            System.out.println("Cliente salvo com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
    }
}