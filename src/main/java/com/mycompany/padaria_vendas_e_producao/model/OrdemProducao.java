package com.mycompany.padaria_vendas_e_producao.model;

public class OrdemProducao {

    private int idOrdemProducao;
    private int idProduto;
    private int idColaborador;
    private String status;
    private double quantidadePlanejada;

    public OrdemProducao() {}

    public OrdemProducao(int idProduto,
                         int idColaborador,
                         double quantidadePlanejada,
                         String status) {

        this.idProduto = idProduto;
        this.idColaborador = idColaborador;
        this.quantidadePlanejada = quantidadePlanejada;
        this.status = status;
    }

    public int getIdOrdemProducao() {
        return idOrdemProducao;
    }

    public void setIdOrdemProducao(int idOrdemProducao) {
        this.idOrdemProducao = idOrdemProducao;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getQuantidadePlanejada() {
        return quantidadePlanejada;
    }

    public void setQuantidadePlanejada(double quantidadePlanejada) {
        this.quantidadePlanejada = quantidadePlanejada;
    }
}