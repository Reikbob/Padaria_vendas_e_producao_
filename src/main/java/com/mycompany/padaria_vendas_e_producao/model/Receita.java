package com.mycompany.padaria_vendas_e_producao.model;

public class Receita {

    private int idReceita;
    private int idProduto;
    private int idIngrediente;
    private double quantidadeIngrediente;

    public Receita() {}

    public Receita(int idProduto,
                   int idIngrediente,
                   double quantidadeIngrediente) {

        this.idProduto = idProduto;
        this.idIngrediente = idIngrediente;
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public double getQuantidadeIngrediente() {
        return quantidadeIngrediente;
    }

    public void setQuantidadeIngrediente(double quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }
}