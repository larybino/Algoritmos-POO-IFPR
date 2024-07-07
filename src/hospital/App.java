package hospital;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Paciente> pacientes = new ArrayList<>();
    static List<Medico> médicos = new ArrayList<>();
    static List<Leito> leitos = new ArrayList<>();
    static List<Exame> exames = new ArrayList<>();
    static List<Consulta> consultas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);

        scanner.close();
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarPaciente();
                break;
            case 2:
                cadastrarMédico();
                break;
            case 3:
                marcarConsulta();
                break;
            case 4:
                solicitarExame();
                break;
            case 5:
                gerenciarLeitos();
                break;
            case 6:
                gerarRelatórios();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void cadastrarPaciente() {
        scanner.nextLine();
        Paciente paciente = new Paciente();
        System.out.println("Digite o nome do paciente:");
        paciente.setNome(scanner.nextLine());
        System.out.println("Digite a data de nascimento do paciente:");
        paciente.setDataNascimento(scanner.nextLine());
        System.out.println("Digite o gênero do paciente:");
        paciente.setGenero(scanner.nextLine());
        System.out.println("Disgite o endereço do paciente:");
        paciente.setEndereco(scanner.nextLine());
        System.out.println("Digite o telefone do paciente:");
        paciente.setTelefone(scanner.nextLine());
        pacientes.add(paciente);
    }

    public static void cadastrarMédico() {
        scanner.nextLine();
        Medico médico = new Medico();
        System.out.println("Digite o nome do médico:");
        médico.setNome(scanner.nextLine());
        System.out.println("Digite a especialidade do médico:");
        médico.setEspecialidade(scanner.nextLine());
        System.out.println("Digite o registro profissional do médico:");
        médico.setRegistroProfissional(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Digite o horário de trabalho do médico:");
        médico.setHorario(scanner.nextLine());
        médicos.add(médico);
    }

    public static void listarPacientes(List<Paciente> pacientes) {
        System.out.println("Lista de Pacientes:");
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente paciente = pacientes.get(i);
            System.out.println("[" + (i + 1) + "] Nome: " + paciente.getNome() + " | Telefone: " + paciente.getTelefone());
        }
    }

    public static void listarMedicos(List<Medico> medicos) {
        System.out.println("Lista de Médicos:");
        for (int i = 0; i < medicos.size(); i++) {
            Medico medico = medicos.get(i);
            System.out.println("[" + (i + 1) + "] Nome: " + medico.getNome() + " | CRM: " + medico.getRegistroProfissional());
        }
    }

    public static void marcarConsulta() {
        scanner.nextLine();
        Consulta consulta = new Consulta();
        System.out.println("Selecione o paciente:");
        listarPacientes(pacientes);
        int indicePaciente = scanner.nextInt();
        consulta.setPaciente(pacientes.get(indicePaciente - 1));
        System.out.println("Selecione o médico:");
        listarMedicos(médicos);
        int indiceMédico = scanner.nextInt();
        consulta.setMedico(médicos.get(indiceMédico - 1));
        scanner.nextLine();
        System.out.println("Digite a data da consulta:");
        consulta.setData(scanner.nextLine());
        System.out.println("Digite a hora da consulta:");
        consulta.setHora(scanner.nextLine());
        System.out.println("Digite o tipo da consulta:");
        consulta.setTipoConsulta(scanner.nextLine());
        System.out.println("Digite as prescriçõs da consulta:");
        consulta.setPrescricoesMedicas(scanner.nextLine());
        consultas.add(consulta);
    }

    public static void solicitarExame() {
        scanner.nextLine();
        Exame exame = new Exame();
        System.out.println("Selecione o paciente:");
        listarPacientes(pacientes);
        int indicePaciente = scanner.nextInt();
        exame.setPaciente(pacientes.get(indicePaciente - 1));
        scanner.nextLine();
        System.out.println("Digite o tipo de exame:");
        exame.setTipoExame(scanner.nextLine());
        System.out.println("Digite a data do exame:");
        exame.setData(scanner.nextLine());
        System.out.println("Digite o horário do exame:");
        exame.setHora(scanner.nextLine());
        System.out.println("Digite o resultado do exame:");
        exame.setResultados(scanner.nextLine());
        exames.add(exame);
    }

    public static void gerenciarLeitos() {
        inicializarLeitos();
        int opcao;
        do {
            exibirMenuLeitos();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    listarLeitosDisponiveis();
                    break;
                case 2:
                    atribuirLeito();
                    break;
                case 3:
                    liberarLeito();
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

    public static void inicializarLeitos() {
        leitos.add(new Leito(1, false, "Ala A"));
        leitos.add(new Leito(2, false, "Ala B"));
        leitos.add(new Leito(3, false, "Ala C")); 
        leitos.add(new Leito(4, false, "Ala D"));
    }

    public static void listarLeitosDisponiveis() {
        System.out.println("Leitos disponíveis:");
        boolean encontrouLeitoDisponivel = false;
        for (Leito leito : leitos) {
            if (!leito.isOcupado()) {
                encontrouLeitoDisponivel = true;
                System.out.println("Número: " + leito.getNumeroLeito() + " | Localização: " + leito.getLocalizacao());
            }
        }
        if (!encontrouLeitoDisponivel) {
            System.out.println("Nenhum leito disponível no momento.");
        }
    }
    

    public static void atribuirLeito() {
        System.out.println("Selecione o paciente:");
        listarPacientes(pacientes);
        int indicePaciente = scanner.nextInt();
        scanner.nextLine(); 
        Paciente paciente = pacientes.get(indicePaciente - 1);

        System.out.println("Selecione o leito disponível:");
        listarLeitosDisponiveis();
        int numeroLeito = scanner.nextInt();
        scanner.nextLine(); 
        Leito leitoSelecionado = null;
        for (Leito leito : leitos) {
            if (leito.getNumeroLeito() == numeroLeito && !leito.isOcupado()) {
                leitoSelecionado = leito;
                break;
            }
        }

        if (leitoSelecionado != null) {
            leitoSelecionado.atribuirPaciente(paciente);
        } else {
            System.out.println("Leito selecionado não está disponível ou não existe.");
        }
    }

    public static void liberarLeito() {
        System.out.println("Digite o número do leito a ser liberado:");
        listarLeitosDisponiveis();
        int numeroLeito = scanner.nextInt();
        scanner.nextLine(); 
        Leito leitoSelecionado = null;
        for (Leito leito : leitos) {
            if (leito.getNumeroLeito() == numeroLeito && leito.isOcupado()) {
                leitoSelecionado = leito;
                break;
            }
        }

        if (leitoSelecionado != null) {
            leitoSelecionado.liberarLeito();
        } else {
            System.out.println("Leito selecionado não está ocupado ou não existe.");
        }
    }

    public static void gerarRelatórios() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
    
        do {
            System.out.println("============================");
            System.out.println("[1] Relatório de Pacientes");
            System.out.println("[2] Relatório de Consultas");
            System.out.println("[3] Relatório de Leitos");
            System.out.println("[0] Voltar ao Menu Principal");
            System.out.println("============================");
            System.out.println("Escolha uma opção:");
    
            opcao = scanner.nextInt();
            scanner.nextLine(); 
    
            switch (opcao) {
                case 1:
                    relatorioPacientes();
                    break;
                case 2:
                    relatorioConsultas();
                    break;
                case 3:
                    relatorioLeitos();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    
        scanner.close();
    }
    
    public static void relatorioPacientes() {
        System.out.println("Relatório de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Data Nascimento: " + paciente.getDataNascimento());
            System.out.println("Endereço: " + paciente.getEndereco());
            System.out.println("Genero: " + paciente.getGenero());
            System.out.println("Telefone: " + paciente.getTelefone());
            System.out.println();
        }
    }
    
    public static void relatorioConsultas() {
        System.out.println("Relatório de Consultas:");
        for (Consulta consulta : consultas) {
            System.out.println("Data: " + consulta.getData());
            System.out.println("Paciente: " + consulta.getPaciente().getNome());
            System.out.println("Médico: " + consulta.getMedico().getNome());
            System.out.println("Tipo de consulta:" + consulta.getTipoConsulta());
            System.out.println();
        }
    }
    
    public static void relatorioLeitos() {
        System.out.println("Relatório de Leitos:");
        for (Leito leito : leitos) {
            System.out.println("Localização: " + leito.getLocalizacao());
            System.out.println("Numero Leito: " + leito.getNumeroLeito());
            System.out.println("Status: " + (leito.isOcupado() ? "Ocupado" : "Disponível"));
            System.out.println();
        }
    }
    
    
    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastrar Paciente");
        System.out.println("[2] Cadastrar Médico");
        System.out.println("[3] Marcar Consulta");
        System.out.println("[4] Solicitar Exame");
        System.out.println("[5] Gerenciar Leitos");
        System.out.println("[6] Gerar Relatórios");
        System.out.println("[0] Sair");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }
    public static void exibirMenuLeitos() {
        System.out.println("============================");
        System.out.println("[1] Listar Leitos Disponíveis");
        System.out.println("[2] Atribuir Leito a Paciente");
        System.out.println("[3] Liberar Leito");
        System.out.println("[0] Voltar ao Menu Principal");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }
}
