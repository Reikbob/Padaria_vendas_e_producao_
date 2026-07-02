package com.mycompany.padaria_vendas_e_producao.model;

public class Ingrediente {

    private int idIngrediente;
    private String nome;
    private double quantidadeEstoque;
    private String unidade;

    public Ingrediente() {}

    public Ingrediente(String nome,
                       double quantidadeEstoque,
                       String unidade) {

        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.unidade = unidade;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}