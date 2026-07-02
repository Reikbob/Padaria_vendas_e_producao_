package com.mycompany.padaria_vendas_e_producao;

import com.mycompany.padaria_vendas_e_producao.model.*;
import com.mycompany.padaria_vendas_e_producao.dao.*;

public class PopulaBanco {

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando a população massiva do banco de dados no Supabase...");

        // ==========================================
        // 1. COLABORADORES (10 registros)
        // ==========================================
        ColaboradorDAO colabDAO = new ColaboradorDAO();
        System.out.println("Salvando 10 Colaboradores...");
        colabDAO.salvar(new Colaborador("Carlos Padeiro", "Padeiro Chefe"));
        colabDAO.salvar(new Colaborador("Ana Caixa", "Operadora de Caixa"));
        colabDAO.salvar(new Colaborador("Marcos Souza", "Padeiro"));
        colabDAO.salvar(new Colaborador("Julia Silva", "Confeiteira"));
        colabDAO.salvar(new Colaborador("Fernando Costa", "Estoquista"));
        colabDAO.salvar(new Colaborador("Patricia Lima", "Gerente"));
        colabDAO.salvar(new Colaborador("Roberto Alves", "Entregador"));
        colabDAO.salvar(new Colaborador("Camila Rocha", "Atendente"));
        colabDAO.salvar(new Colaborador("Diego Mendes", "Auxiliar de Limpeza"));
        colabDAO.salvar(new Colaborador("Amanda Ribeiro", "Auxiliar de Padeiro"));

        // ==========================================
        // 2. CLIENTES (10 registros)
        // ==========================================
        ClienteDAO clienteDAO = new ClienteDAO();
        System.out.println("Salvando 10 Clientes...");
        clienteDAO.salvar(new Cliente("João Silva", "111.222.333-44", "(51) 99999-1111", "joao@email.com", "Rua A, 123"));
        clienteDAO.salvar(new Cliente("Maria Oliveira", "555.666.777-88", "(51) 98888-2222", "maria@email.com", "Rua B, 456"));
        clienteDAO.salvar(new Cliente("Pedro Souza", "123.456.789-00", "(51) 97777-3333", "pedro@email.com", "Rua C, 789"));
        clienteDAO.salvar(new Cliente("Lucas Mendes", "987.654.321-11", "(51) 96666-4444", "lucas@email.com", "Rua D, 101"));
        clienteDAO.salvar(new Cliente("Ana Paula", "222.333.444-55", "(51) 95555-5555", "ana@email.com", "Rua E, 202"));
        clienteDAO.salvar(new Cliente("Carlos Eduardo", "333.444.555-66", "(51) 94444-6666", "carlos@email.com", "Rua F, 303"));
        clienteDAO.salvar(new Cliente("Beatriz Costa", "444.555.666-77", "(51) 93333-7777", "beatriz@email.com", "Rua G, 404"));
        clienteDAO.salvar(new Cliente("Rafael Lima", "777.888.999-00", "(51) 92222-8888", "rafael@email.com", "Rua H, 505"));
        clienteDAO.salvar(new Cliente("Fernanda Rocha", "888.999.000-11", "(51) 91111-9999", "fernanda@email.com", "Rua I, 606"));
        clienteDAO.salvar(new Cliente("Julia Alves", "999.000.111-22", "(51) 90000-0000", "julia@email.com", "Rua J, 707"));

        // ==========================================
        // 3. EQUIPAMENTOS (10 registros)
        // ==========================================
        EquipamentoDAO equipDAO = new EquipamentoDAO();
        System.out.println("Salvando 10 Equipamentos...");
        equipDAO.salvar(new Equipamento("Forno Industrial A", "Capacidade 100 pães", "Ativo"));
        equipDAO.salvar(new Equipamento("Batedeira Planetária", "Capacidade 5 litros", "Ativo"));
        equipDAO.salvar(new Equipamento("Amassadeira Espiral", "Capacidade 25 kg", "Ativo"));
        equipDAO.salvar(new Equipamento("Divisora de Massas", "30 divisões", "Ativo"));
        equipDAO.salvar(new Equipamento("Modeladora de Pães", "500 pães/h", "Manutenção"));
        equipDAO.salvar(new Equipamento("Fatiadeira de Pão", "Fatias de 12 mm", "Ativo"));
        equipDAO.salvar(new Equipamento("Geladeira Comercial", "500 litros", "Ativo"));
        equipDAO.salvar(new Equipamento("Máquina de Café Expresso", "2 grupos", "Ativo"));
        equipDAO.salvar(new Equipamento("Estufa Fria para Tortas", "2 metros", "Ativo"));
        equipDAO.salvar(new Equipamento("Extintor de Incêndio ABC", "6 kg", "Ativo"));

        // ==========================================
        // 4. INGREDIENTES (10 registros)
        // ==========================================
        IngredienteDAO ingDAO = new IngredienteDAO();
        System.out.println("Salvando 10 Ingredientes...");
        ingDAO.salvar(new Ingrediente("Farinha de Trigo", 50.00, "kg"));
        ingDAO.salvar(new Ingrediente("Açúcar", 20.00, "kg"));
        ingDAO.salvar(new Ingrediente("Fermento", 2.00, "kg"));
        ingDAO.salvar(new Ingrediente("Ovos", 15.00, "dz"));
        ingDAO.salvar(new Ingrediente("Leite", 30.00, "L"));
        ingDAO.salvar(new Ingrediente("Manteiga", 10.00, "kg"));
        ingDAO.salvar(new Ingrediente("Chocolate em Pó", 5.00, "kg"));
        ingDAO.salvar(new Ingrediente("Sal", 10.00, "kg"));
        ingDAO.salvar(new Ingrediente("Queijo Minas", 8.00, "kg"));
        ingDAO.salvar(new Ingrediente("Morango Fresco", 4.00, "kg"));

        // ==========================================
        // 5. PRODUTOS (10 registros)
        // ==========================================
        ProdutoDAO prodDAO = new ProdutoDAO();
        System.out.println("Salvando 10 Produtos...");
        prodDAO.salvar(new Produto("Pão Francês", "Padaria", "Pão tradicional quentinho", 0.80, 0.30, 100, ""));
        prodDAO.salvar(new Produto("Bolo de Chocolate", "Confeitaria", "Bolo caseiro com cobertura", 25.00, 10.00, 5, ""));
        prodDAO.salvar(new Produto("Café Expresso", "Bebidas", "Café moído na hora", 5.00, 1.00, 50, ""));
        prodDAO.salvar(new Produto("Pão de Queijo", "Padaria", "Porção com 5 unidades", 6.50, 2.50, 30, ""));
        prodDAO.salvar(new Produto("Croissant", "Padaria", "Massa folhada amanteigada", 8.00, 3.00, 20, ""));
        prodDAO.salvar(new Produto("Sonho de Creme", "Confeitaria", "Doce recheado com creme de baunilha", 4.50, 1.50, 15, ""));
        prodDAO.salvar(new Produto("Torta de Morango", "Confeitaria", "Fatia de torta com frutas frescas", 12.00, 5.00, 10, ""));
        prodDAO.salvar(new Produto("Pão Integral", "Padaria", "Pão rico em fibras", 10.00, 4.00, 15, ""));
        prodDAO.salvar(new Produto("Biscoito Amanteigado", "Padaria", "Pacote 100g", 7.50, 2.50, 25, ""));
        prodDAO.salvar(new Produto("Suco de Laranja", "Bebidas", "Copo 300ml natural", 8.00, 3.00, 40, ""));

        // ==========================================
        // 6. USUÁRIOS (10 registros)
        // ==========================================
        UsuarioDAO usuDAO = new UsuarioDAO();
        System.out.println("Salvando 10 Usuários...");
        usuDAO.salvar(new Usuario("carlos.padeiro", "senha123", "Padeiro"));
        usuDAO.salvar(new Usuario("ana.caixa", "senha123", "Caixa"));
        usuDAO.salvar(new Usuario("marcos.souza", "senha123", "Padeiro"));
        usuDAO.salvar(new Usuario("julia.silva", "senha123", "Confeiteira"));
        usuDAO.salvar(new Usuario("fernando.costa", "senha123", "Estoquista"));
        usuDAO.salvar(new Usuario("patricia.lima", "senha123", "Gerente"));
        usuDAO.salvar(new Usuario("roberto.alves", "senha123", "Entregador"));
        usuDAO.salvar(new Usuario("camila.rocha", "senha123", "Atendente"));
        usuDAO.salvar(new Usuario("diego.mendes", "senha123", "Auxiliar"));
        usuDAO.salvar(new Usuario("amanda.ribeiro", "senha123", "Auxiliar"));

        // ==========================================
        // 7. ORDEM DE PRODUÇÃO (10 registros)
        // ==========================================
        OrdemProducaoDAO ordemDAO = new OrdemProducaoDAO();
        System.out.println("Salvando 10 Ordens de Produção...");
        // Construtor: idProduto, idColaborador, quantidadePlanejada, status
        ordemDAO.salvar(new OrdemProducao(1, 1, 100.0, "Concluída"));
        ordemDAO.salvar(new OrdemProducao(2, 4, 5.0, "Concluída"));
        ordemDAO.salvar(new OrdemProducao(4, 3, 50.0, "Em Andamento"));
        ordemDAO.salvar(new OrdemProducao(5, 1, 30.0, "Aguardando"));
        ordemDAO.salvar(new OrdemProducao(6, 4, 20.0, "Concluída"));
        ordemDAO.salvar(new OrdemProducao(7, 4, 3.0, "Aguardando"));
        ordemDAO.salvar(new OrdemProducao(8, 3, 40.0, "Concluída"));
        ordemDAO.salvar(new OrdemProducao(9, 10, 20.0, "Em Andamento"));
        ordemDAO.salvar(new OrdemProducao(1, 1, 150.0, "Aguardando"));
        ordemDAO.salvar(new OrdemProducao(4, 3, 60.0, "Aguardando"));

        // ==========================================
        // 8. ETAPAS DE PRODUÇÃO (10 registros)
        // ==========================================
        EtapaProducaoDAO etapaDAO = new EtapaProducaoDAO();
        System.out.println("Salvando 10 Etapas de Produção...");
        // Construtor: idOrdem, nomeEtapa, status, idEquipamento, idColaborador
        etapaDAO.salvar(new EtapaProducao(1, "Assar no forno", "Concluída", 1, 1));
        etapaDAO.salvar(new EtapaProducao(2, "Preparar cobertura", "Concluída", 2, 4));
        etapaDAO.salvar(new EtapaProducao(3, "Bolear massa", "Em Andamento", 3, 3));
        etapaDAO.salvar(new EtapaProducao(4, "Dobras da massa", "Aguardando", 4, 1));
        etapaDAO.salvar(new EtapaProducao(5, "Fritura e recheio", "Concluída", 1, 4));
        etapaDAO.salvar(new EtapaProducao(6, "Montagem das frutas", "Aguardando", 7, 4));
        etapaDAO.salvar(new EtapaProducao(7, "Descanso da massa", "Concluída", 5, 3));
        etapaDAO.salvar(new EtapaProducao(8, "Corte dos biscoitos", "Em Andamento", 6, 10));
        etapaDAO.salvar(new EtapaProducao(9, "Bater massa no cilindro", "Aguardando", 3, 1));
        etapaDAO.salvar(new EtapaProducao(10, "Separação dos queijos", "Aguardando", 7, 3));

        // ==========================================
        // 9. VENDAS (10 registros)
        // ==========================================
        VendaDAO vendaDAO = new VendaDAO();
        System.out.println("Salvando 10 Vendas...");
        // Construtor: idCliente, idProduto, idColaborador, quantidade, valorVenda
        vendaDAO.salvar(new Venda(1, 1, 2, 10.0, 13.00));
        vendaDAO.salvar(new Venda(2, 2, 2, 1.0, 25.00));
        vendaDAO.salvar(new Venda(3, 4, 8, 1.0, 14.50));
        vendaDAO.salvar(new Venda(4, 5, 8, 1.0, 8.00));
        vendaDAO.salvar(new Venda(5, 7, 2, 1.0, 12.00));
        vendaDAO.salvar(new Venda(6, 4, 8, 1.0, 6.50));
        vendaDAO.salvar(new Venda(7, 8, 2, 1.0, 10.00));
        vendaDAO.salvar(new Venda(8, 6, 8, 1.0, 4.50));
        vendaDAO.salvar(new Venda(9, 9, 2, 2.0, 15.50));
        vendaDAO.salvar(new Venda(10, 3, 8, 1.0, 5.00));

        // ==========================================
        // 10. ITENS DE VENDA (10 registros)
        // ==========================================
        ItemVendaDAO itemDAO = new ItemVendaDAO();
        System.out.println("Salvando 10 Itens de Venda...");
        // Construtor: idVenda, idProduto, quantidade, subtotal
        itemDAO.salvar(new ItemVenda(1, 1, 10.0, 8.00));
        itemDAO.salvar(new ItemVenda(2, 2, 1.0, 25.00));
        itemDAO.salvar(new ItemVenda(3, 4, 1.0, 6.50));
        itemDAO.salvar(new ItemVenda(4, 5, 1.0, 8.00));
        itemDAO.salvar(new ItemVenda(5, 7, 1.0, 12.00));
        itemDAO.salvar(new ItemVenda(6, 4, 1.0, 6.50));
        itemDAO.salvar(new ItemVenda(7, 8, 1.0, 10.00));
        itemDAO.salvar(new ItemVenda(8, 6, 1.0, 4.50));
        itemDAO.salvar(new ItemVenda(9, 9, 2.0, 15.00));
        itemDAO.salvar(new ItemVenda(10, 3, 1.0, 5.00));

        // ==========================================
        // 11. PAGAMENTOS (10 registros)
        // ==========================================
        PagamentoDAO pagDAO = new PagamentoDAO();
        System.out.println("Salvando 10 Pagamentos...");
        // Construtor: idVenda, formaPagamento, valorPago, troco
        pagDAO.salvar(new Pagamento(1, "PIX", 13.00, 0.0));
        pagDAO.salvar(new Pagamento(2, "Cartão de Crédito", 25.00, 0.0));
        pagDAO.salvar(new Pagamento(3, "Dinheiro", 15.00, 0.5));
        pagDAO.salvar(new Pagamento(4, "Cartão de Débito", 8.00, 0.0));
        pagDAO.salvar(new Pagamento(5, "PIX", 12.00, 0.0));
        pagDAO.salvar(new Pagamento(6, "Dinheiro", 10.00, 3.5));
        pagDAO.salvar(new Pagamento(7, "Cartão de Crédito", 10.00, 0.0));
        pagDAO.salvar(new Pagamento(8, "PIX", 4.50, 0.0));
        pagDAO.salvar(new Pagamento(9, "Cartão de Débito", 15.50, 0.0));
        pagDAO.salvar(new Pagamento(10, "Dinheiro", 5.00, 0.0));

        System.out.println("✅ TUDO PRONTO! O banco de dados foi populado com sucesso (10 registros em cada tabela)!");
    }
}
