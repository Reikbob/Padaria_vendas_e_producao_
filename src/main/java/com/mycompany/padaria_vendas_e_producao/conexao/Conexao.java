package com.mycompany.padaria_vendas_e_producao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        try {

            String url =
            "jdbc:postgresql://db.egclmssooifdmvczmujp.supabase.co:5432/postgres";

            String usuario = "postgres";
            String senha = "poouergs123";

            Connection conn =
            DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conectado!");

            return conn;

        } catch (Exception e) {

            System.out.println("Erro: " + e);

            return null;
        }
    }
}