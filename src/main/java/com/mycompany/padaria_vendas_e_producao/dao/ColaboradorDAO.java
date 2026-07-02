package com.mycompany.padaria_vendas_e_producao.dao;

import com.mycompany.padaria_vendas_e_producao.conexao.Conexao;
import com.mycompany.padaria_vendas_e_producao.model.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ColaboradorDAO {
    
    public void salvar(Colaborador colab) {
        String sql = "INSERT INTO colaboradores (nome, funcao) VALUES (?, ?)";
        
        try (Connection conn = Conexao.conectar(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, colab.getNome());
            stmt.setString(2, colab.getFuncao());
            
            stmt.executeUpdate();
            System.out.println("Colaborador salvo com sucesso!");
            
        } catch (SQLException e) {
            System.out.println("Erro ao salvar colaborador: " + e.getMessage());
        }
    }
}