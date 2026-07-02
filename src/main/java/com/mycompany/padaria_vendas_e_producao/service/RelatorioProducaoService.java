package com.mycompany.padaria_vendas_e_producao.service;

public class RelatorioProducaoService {

    public void gerarRelatorioProducao() {
        System.out.println("Relatório de produção gerado!");
    }

    public double calcularAproveitamento(double produzido,
                                         double perdido) {

        return ((produzido - perdido) / produzido) * 100;
    }
}