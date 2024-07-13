package biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List <Livro> livros = new ArrayList<>();
    static List <Usuario> usuarios = new ArrayList<>();
    static List <Emprestimo> emprestimos = new ArrayList<>();
    static List <Notificacao> notificacoes = new ArrayList<>();
    static List <Reserva> reservas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                cadastrarEmprestimo();
                break;
            case 4:
                cadastrarNotificacao();
                break;
            case 5:
                cadastrarReserva();
                break;
            case 6:
                gerarRelatorioLivros();
                break;
            case 7:
                gerarRelatorioUsuarios();
                break;
            case 8:
                gerarRelatorioEmprestimos();
                break;
            case 9:
                gerarRelatorioNotificacoes();
                break;
            case 10:
                gerarRelatorioReservas();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    //UTILIZANDO O CONSTRUTOR
    public static void cadastrarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite a editora do livro:");
        String editora = scanner.nextLine();
        System.out.println("Digite a categoria do livro:");
        String categoria = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, editora, categoria);
        livros.add(livro);
    }

    //UTILIZANDO O CONSTRUTOR
    public static void cadastrarUsuario() {
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do usuário:");
        String email = scanner.nextLine();
        System.out.println("Digite a data de cadastro do usuário:");
        String dataCadastro = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, dataCadastro);
        usuarios.add(usuario);
    }

    //UTILIZANDO O SETTER
    public static void cadastrarEmprestimo() {
        Emprestimo emprestimo = new Emprestimo();

        System.out.println("Digite a data de retirada do empréstimo:");
        emprestimo.setDataRetirada(scanner.nextLine());

        System.out.println("Digite a data de devolução do empréstimo:");
        emprestimo.setDataDevolucao(scanner.nextLine());

        System.out.println("Digite o status do empréstimo:");
        emprestimo.setStatus(scanner.nextLine());

        emprestimos.add(emprestimo);
    }

    //UTILIZANDO O SETTER
    public static void cadastrarNotificacao() {
        Notificacao notificacao = new Notificacao();

        System.out.println("Digite o tipo de notificação:");
        notificacao.setTipo(scanner.nextLine());

        System.out.println("Digite a mensagem da notificação:");
        notificacao.setMensagem(scanner.nextLine());

        notificacoes.add(notificacao);
    }

    //UTILIZANDO O CONSTRUTOR
    public static void cadastrarReserva() {
        System.out.println("Digite a data de reserva:");
        String dataReserva = scanner.nextLine();
        System.out.println("Digite a data de retirada desejada:");
        String dataRetiradaDesejada = scanner.nextLine();
        System.out.println("Digite o status da reserva:");
        String status = scanner.nextLine();

        Reserva reserva = new Reserva(dataReserva, dataRetiradaDesejada, status);
        reservas.add(reserva);
    }

    public static void gerarRelatorioLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Categoria: " + livro.getCategoria());
            System.out.println();
        }
    }

    public static void gerarRelatorioUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
            System.out.println();
        }
    }

    public static void gerarRelatorioEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Data de retirada: " + emprestimo.getDataRetirada());
            System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());
            System.out.println("Status: " + emprestimo.getStatus());
            System.out.println();
        }
    }

    public static void gerarRelatorioNotificacoes() {
        for (Notificacao notificacao : notificacoes) {
            System.out.println("Tipo: " + notificacao.getTipo());
            System.out.println("Mensagem: " + notificacao.getMensagem());
            System.out.println();
        }
    }

    public static void gerarRelatorioReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Data da reserva: " + reserva.getDataReserva());
            System.out.println("Data da retirada prevista: " + reserva.getDataRetiradaDesejada());
            System.out.println("Status: " + reserva.getStatus());
            System.out.println();
        }
    }

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastrar Livro");
        System.out.println("[2] Cadastrar Usuário");
        System.out.println("[3] Cadastrar Empréstimo");
        System.out.println("[4] Cadastrar Notificação");
        System.out.println("[5] Cadastrar Reserva");
        System.out.println("[6] Gerar Relatório de Livros");
        System.out.println("[7] Gerar Relatório de Usuários");
        System.out.println("[8] Gerar Relatório de Empréstimos");
        System.out.println("[9] Gerar Relatório de Notificações");
        System.out.println("[10] Gerar Relatório de Reservas");
        System.out.println("[0] Sair");
        System.out.println("============================");
    }

}
