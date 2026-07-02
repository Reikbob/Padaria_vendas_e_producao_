package com.mycompany.padaria_vendas_e_producao.model;

public class Venda {

    private int idVendas;
    private int idCliente;
    private int idProduto;
    private int idColaborador;
    private double quantidade;
    private double valorVenda;

    public Venda() {}

    public Venda(int idCliente,
                 int idProduto,
                 int idColaborador,
                 double quantidade,
                 double valorVenda) {

        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.idColaborador = idColaborador;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}