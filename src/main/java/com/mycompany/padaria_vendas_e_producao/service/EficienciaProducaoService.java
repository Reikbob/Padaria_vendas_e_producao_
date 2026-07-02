package com.mycompany.padaria_vendas_e_producao.service;

public class EficienciaProducaoService {

    public double calcularEficiencia(double producaoReal,
                                     double producaoPlanejada) {

        return (producaoReal / producaoPlanejada) * 100;
    }
}