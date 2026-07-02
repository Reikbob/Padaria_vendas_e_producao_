package com.mycompany.padaria_vendas_e_producao.model;

public class Pagamento {

    private int idPagamento;
    private int idVenda;
    private String formaPagamento;
    private double valorPago;
    private double troco;

    public Pagamento() {}

    public Pagamento(int idVenda,
                     String formaPagamento,
                     double valorPago,
                     double troco) {

        this.idVenda = idVenda;
        this.formaPagamento = formaPagamento;
        this.valorPago = valorPago;
        this.troco = troco;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
    }
}