package com.mycompany.padaria_vendas_e_producao.service;

public class RelatorioVendasService {

    public void gerarRelatorio() {
        System.out.println("Relatório de vendas gerado!");
    }

    public double calcularTotalVendas(double[] vendas) {

        double total = 0;

        for (double v : vendas) {
            total += v;
        }

        return total;
    }
}