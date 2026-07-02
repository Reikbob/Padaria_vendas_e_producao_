package com.mycompany.padaria_vendas_e_producao.model;

public class Produto {

    private int idProduto;
    private String nome;
    private String categoria; // Adicionado para o banco integrado
    private String descricao; // Adicionado para o banco integrado
    private double quantidadeEstoque;
    private double preco;
    private double custo; // Adicionado para o banco integrado
    private String linkInfoWeb; // Adicionado para o banco integrado

    public Produto() {}

    public Produto(String nome, String categoria, String descricao, double preco, double custo, double quantidadeEstoque, String linkInfoWeb) {
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.custo = custo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.linkInfoWeb = linkInfoWeb;
    }

    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public double getCusto() { return custo; }
    public void setCusto(double custo) { this.custo = custo; }

    public double getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(double quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public String getLinkInfoWeb() { return linkInfoWeb; }
    public void setLinkInfoWeb(String linkInfoWeb) { this.linkInfoWeb = linkInfoWeb; }
}