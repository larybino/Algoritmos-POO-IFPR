package vendas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("============================");
            System.out.println("Sistema de Gerenciamento de Vendas On-line");
            System.out.println("============================");
            System.out.println("[1] Criar novo cliente");
            System.out.println("[2] Criar novo vendedor");
            System.out.println("[3] Adicionar produto ao vendedor");
            System.out.println("[4] Adicionar produto ao carrinho");
            System.out.println("[5] Fazer pedido");
            System.out.println("[6] Gerar relatório");
            System.out.println("[0] Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    criarNovoCliente();
                    break;
                case 2:
                    criarNovoVendedor();
                    break;
                case 3:
                    adicionarProdutoAoVendedor();
                    break;
                case 4:
                    adicionarProdutoAoCarrinho();
                    break;
                case 5:
                    fazerPedido();
                    break;
                case 6:
                    gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void criarNovoCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        
        Cliente cliente = new Cliente(nome, endereco, email);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void criarNovoVendedor() {
        System.out.print("Digite o nome/empresa do vendedor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o email do vendedor: ");
        String email = scanner.nextLine();
        System.out.print("Digite o estatística de vendas do vendedor: ");
        String estatistica = scanner.nextLine();
        System.out.print("Digite o gestão de estoque do vendedor: ");
        String gestaoEstoque = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nome, email, estatistica, gestaoEstoque);
        vendedores.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
    }

    private static void adicionarProdutoAoVendedor() {
        if (vendedores.isEmpty()) {
            System.out.println("Não há vendedores cadastrados.");
            return;
        }

        System.out.println("Selecione o vendedor:");
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getNomeEmpresa());
        }
        int indexVendedor = scanner.nextInt();
        scanner.nextLine(); 

        if (indexVendedor < 1 || indexVendedor > vendedores.size()) {
            System.out.println("Índice de vendedor inválido.");
            return;
        }

        Vendedor vendedor = vendedores.get(indexVendedor - 1);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite a categoria do produto: ");
        String categoria = scanner.nextLine();

        Produto produto = new Produto(nome, descricao, preco, quantidade, categoria);
        vendedor.adicionarProduto(produto);
        System.out.println("Produto adicionado com sucesso ao vendedor " + vendedor.getNomeEmpresa() + "!");
    }

    private static void adicionarProdutoAoCarrinho() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
    
        System.out.println("Selecione o cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        int indexCliente = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexCliente < 1 || indexCliente > clientes.size()) {
            System.out.println("Índice de cliente inválido.");
            return;
        }
    
        Cliente cliente = clientes.get(indexCliente - 1);
    
        if (vendedores.isEmpty()) {
            System.out.println("Não há vendedores cadastrados.");
            return;
        }
    
        System.out.println("Selecione o vendedor do qual deseja comprar:");
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println((i + 1) + ". " + vendedores.get(i).getNomeEmpresa());
        }
        int indexVendedor = scanner.nextInt();
        scanner.nextLine();
    
        if (indexVendedor < 1 || indexVendedor > vendedores.size()) {
            System.out.println("Índice de vendedor inválido.");
            return;
        }
    
        Vendedor vendedor = vendedores.get(indexVendedor - 1);
    
        if (vendedor.getProdutos().isEmpty()) {
            System.out.println("O vendedor não possui produtos.");
            return;
        }
    
        System.out.println("Selecione o produto:");
        for (int i = 0; i < vendedor.getProdutos().size(); i++) {
            System.out.println((i + 1) + ". " + vendedor.getProdutos().get(i).getNomeProduto());
        }
        int indexProduto = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexProduto < 1 || indexProduto > vendedor.getProdutos().size()) {
            System.out.println("Índice de produto inválido.");
            return;
        }
    
        Produto produto = vendedor.getProdutos().get(indexProduto - 1);
    
        cliente.getCarrinhoAtual().adicionarProduto(produto);
        System.out.println("Produto adicionado ao carrinho com sucesso!");
    }
    
    
    

    private static void fazerPedido() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
    
        System.out.println("Selecione o cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        int indexCliente = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexCliente < 1 || indexCliente > clientes.size()) {
            System.out.println("Índice de cliente inválido.");
            return;
        }
    
        Cliente cliente = clientes.get(indexCliente - 1);
    
        Carrinho carrinhoAtual = cliente.getCarrinhoAtual();
    
        if (carrinhoAtual == null || carrinhoAtual.getProdutos().isEmpty()) {
            System.out.println("O carrinho do cliente está vazio.");
            return;
        }
    
        Pedido pedido = new Pedido(cliente, carrinhoAtual.getProdutos());
        for (Produto produto : pedido.getProdutos()) {
            produto.diminuirEstoque(1);
        }
        pedidos.add(pedido);
        carrinhoAtual.getProdutos().clear();
        System.out.println("Pedido realizado com sucesso!");
        System.out.println("Total do pedido: R$ " + pedido.getTotal());
    }



    private static void gerarRelatorio() {
        System.out.println("========== Relatório ==========");
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", Email: " + cliente.getEmail() + ", Endereço: " + cliente.getEndereco());
        }

        System.out.println("\nVendedores cadastrados:");
        for (Vendedor vendedor : vendedores) {
            System.out.println("Nome/Empresa: " + vendedor.getNomeEmpresa() + ", Email: " + vendedor.getInformacoesContato());
            System.out.println("Produtos do vendedor:");
            for (Produto produto : vendedor.getProdutos()) {
                System.out.println("Nome: " + produto.getNomeProduto() + ", Descrição: " + produto.getEscricaoProduto() + ", Preço: R$" + produto.getPreco() + ", Quantidade em estoque: " + produto.getQuantidadeEstoque() + ", Categoria: " + produto.getCategoria());
            }
        }

        System.out.println("\nPedidos realizados:");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente().getNome() + ", Total do pedido: R$" + pedido.getTotal());
            System.out.println("Produtos do pedido:");
            for (Produto produto : pedido.getProdutos()) {
                System.out.println("Nome: " + produto.getNomeProduto() + ", Descrição: " + produto.getEscricaoProduto() + ", Preço: R$" + produto.getPreco());
            }
        System.out.println("================================");
        }

        
    }
}
