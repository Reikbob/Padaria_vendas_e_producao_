package com.mycompany.padaria_vendas_e_producao.model;

public class EtapaProducao {

    private int idEtapa;
    private int idOrdemProducao;
    private String nomeEtapa;
    private String status;

    public EtapaProducao() {}

    public EtapaProducao(int idOrdemProducao,
                         String nomeEtapa,
                         String status) {

        this.idOrdemProducao = idOrdemProducao;
        this.nomeEtapa = nomeEtapa;
        this.status = status;
    }

    public int getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(int idEtapa) {
        this.idEtapa = idEtapa;
    }

    public int getIdOrdemProducao() {
        return idOrdemProducao;
    }

    public void setIdOrdemProducao(int idOrdemProducao) {
        this.idOrdemProducao = idOrdemProducao;
    }

    public String getNomeEtapa() {
        return nomeEtapa;
    }

    public void setNomeEtapa(String nomeEtapa) {
        this.nomeEtapa = nomeEtapa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}