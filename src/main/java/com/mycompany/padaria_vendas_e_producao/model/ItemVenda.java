package com.mycompany.padaria_vendas_e_producao.model;

public class ItemVenda {

    private int idItem;
    private int idVenda;
    private int idProduto;
    private double quantidade;
    private double subtotal;

    public ItemVenda() {}

    public ItemVenda(int idVenda,
                     int idProduto,
                     double quantidade,
                     double subtotal) {

        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}