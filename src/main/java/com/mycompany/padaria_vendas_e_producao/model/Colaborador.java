package com.mycompany.padaria_vendas_e_producao.model;

public class Colaborador {

    private int idColaborador;
    private String nome;
    private String funcao;

    public Colaborador() {}

    public Colaborador(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}