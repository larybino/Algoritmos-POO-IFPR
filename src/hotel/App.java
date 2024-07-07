package hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Reserva> reservas = new ArrayList<>();
    static List<Quarto> quartos = new ArrayList<>();
    static List<Hospede> hospedes = new ArrayList<>();
    static List<Funcionario> funcionarios = new ArrayList<>();
    static List<Servico> servicos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarQuartos();
        inicializarServicos();
        int opcao = 0;

        do {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            roteador(opcao);
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("============================");
        System.out.println("[1] Registrar Reserva");
        System.out.println("[2] Listar Reservas");
        System.out.println("[3] Listar Quartos Disponíveis");
        System.out.println("[4] Gerenciar Funcionários");
        System.out.println("[5] Solicitar Serviço");
        System.out.println("[6] Gerar Relatórios");
        System.out.println("[0] Sair");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                registrarReserva();
                break;
            case 2:
                listarReservas();
                break;
            case 3:
                listarQuartosDisponiveis();
                break;
            case 4:
                gerenciarFuncionarios();
                break;
            case 5:
                solicitarServico();
                break;
            case 6:
                gerarRelatorios();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void inicializarQuartos() {
        quartos.add(new Quarto(1, "Standard", false));
        quartos.add(new Quarto(2, "Deluxe", false));
        quartos.add(new Quarto(3, "Suite", false));
    }

    public static void inicializarServicos() {
        servicos.add(new Servico("Serviço de quarto", "Entrega de refeições no quarto", 50.0, "Disponível"));
        servicos.add(new Servico("Reserva de passeio turístico", "Passeios pela cidade", 100.0, "Disponível"));
    }

    public static void registrarReserva() {
        System.out.println("Digite o nome do hóspede:");
        String nomeHospede = scanner.nextLine();

        System.out.println("Digite o sobrenome do hóspede:");
        String sobrenomeHospede = scanner.nextLine();

        System.out.println("Digite o email do hóspede:");
        String emailHospede = scanner.nextLine();

        System.out.println("Digite o telefone do hóspede:");
        String telefoneHospede = scanner.nextLine();

        Hospede hospede = new Hospede(nomeHospede, sobrenomeHospede, emailHospede, telefoneHospede);
        hospedes.add(hospede);

        System.out.println("Digite a data de check-in (dd/mm/aaaa):");
        String dataCheckIn = scanner.nextLine();

        System.out.println("Digite a data de check-out (dd/mm/aaaa):");
        String dataCheckOut = scanner.nextLine();

        System.out.println("Selecione o tipo de quarto:");
        for (int i = 0; i < quartos.size(); i++) {
            Quarto quarto = quartos.get(i);
            System.out.println("[" + (i + 1) + "] Tipo: " + quarto.getTipo() + " | Disponível: " + (!quarto.isOcupado()));
        }
        int indiceQuarto = scanner.nextInt() - 1;
        Quarto quartoSelecionado = quartos.get(indiceQuarto);
        quartoSelecionado.setOcupado(true);

        Reserva reserva = new Reserva(hospede, quartoSelecionado, dataCheckIn, dataCheckOut);
        reservas.add(reserva);

        System.out.println("Reserva registrada com sucesso!");
    }

    public static void listarReservas() {
        System.out.println("Lista de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                    " | Check-in: " + reserva.getDataCheckIn() +
                    " | Check-out: " + reserva.getDataCheckOut() +
                    " | Quarto: " + reserva.getQuarto().getTipo());
        }
    }

    public static void listarQuartosDisponiveis() {
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            if (!quarto.isOcupado()) {
                System.out.println("Número: " + quarto.getNumero() + " | Tipo: " + quarto.getTipo());
            }
        }
    }

    public static void gerenciarFuncionarios() {
        int opcao;
        do {
            exibirMenuFuncionarios();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuFuncionarios() {
        System.out.println("============================");
        System.out.println("[1] Cadastrar Funcionário");
        System.out.println("[2] Listar Funcionários");
        System.out.println("[0] Voltar ao Menu Principal");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }

    public static void cadastrarFuncionario() {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o sobrenome do funcionário:");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.nextLine();
        System.out.println("Digite quantas horas de trabalho do funcionário:");
        String horarioTrabalho = scanner.nextLine();
        System.out.println("Digite o departamento do funcionário:");
        String departamento = scanner.nextLine();
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        Funcionario funcionario = new Funcionario(nome, sobrenome, cargo, horarioTrabalho, departamento, salario);
        funcionarios.add(funcionario);

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public static void listarFuncionarios() {
        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() +
                    " | Cargo: " + funcionario.getCargo() +
                    " | Salário: " + funcionario.getSalario());
        }
    }

    public static void solicitarServico() {
        System.out.println("Selecione o serviço:");
        for (int i = 0; i < servicos.size(); i++) {
            Servico servico = servicos.get(i);
            System.out.println("[" + (i + 1) + "] Tipo: " + servico.getTipoServico() + 
                               " | Descrição: " + servico.getDescricao() + 
                               " | Preço: " + servico.getPreco() + 
                               " | Disponibilidade: " + servico.getDisponibilidade());
        }
        int indiceServico = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar o buffer do scanner
        Servico servicoSelecionado = servicos.get(indiceServico);

        System.out.println("Digite o nome do hóspede solicitante:");
        String nomeHospede = scanner.nextLine();
        Hospede hospede = null;
        for (Hospede h : hospedes) {
            if (h.getNome().equalsIgnoreCase(nomeHospede)) {
                hospede = h;
                break;
            }
        }

        if (hospede == null) {
            System.out.println("Hóspede não encontrado!");
        } else {
            System.out.println("Serviço " + servicoSelecionado.getDescricao() + 
                               " solicitado com sucesso pelo hóspede " + hospede.getNome() + "!");
        }
    }

    public static void gerarRelatorios() {
        int opcao;
        do {
            exibirMenuRelatorios();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    relatorioReservas();
                    break;
                case 2:
                    relatorioQuartos();
                    break;
                case 3:
                    relatorioFuncionarios();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuRelatorios() {
        System.out.println("============================");
        System.out.println("[1] Relatório de Reservas");
        System.out.println("[2] Relatório de Quartos");
        System.out.println("[3] Relatório de Funcionários");
        System.out.println("[0] Voltar ao Menu Principal");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }

    public static void relatorioReservas() {
        System.out.println("Relatório de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println("Hóspede: " + reserva.getHospede().getNome() +
                    " | Check-in: " + reserva.getDataCheckIn() +
                    " | Check-out: " + reserva.getDataCheckOut() +
                    " | Quarto: " + reserva.getQuarto().getTipo());
        }
    }

    public static void relatorioQuartos() {
        System.out.println("Relatório de Quartos:");
        for (Quarto quarto : quartos) {
            System.out.println("Número: " + quarto.getNumero() +
                    " | Tipo: " + quarto.getTipo() +
                    " | Status: " + (quarto.isOcupado() ? "Ocupado" : "Disponível"));
        }
    }

    public static void relatorioFuncionarios() {
        System.out.println("Relatório de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() +
                    " | Cargo: " + funcionario.getCargo() +
                    " | Salário: " + funcionario.getSalario());
        }
    }
}
