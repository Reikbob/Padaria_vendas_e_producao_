package com.mycompany.padaria_vendas_e_producao.model;

public class Equipamento {

    private int idEquipamento;
    private String nome;
    private String descricao;
    private String status;

    public Equipamento() {}

    public Equipamento(String nome,
                        String descricao,
                        String status) {

        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}