package advocacia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Advogado> advogados = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static List<Processo> processos = new ArrayList<>();
    static List<Documento> documentos = new ArrayList<>();
    static List<Agenda> agenda = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

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
        System.out.println("[1] Cadastrar Advogado");
        System.out.println("[2] Cadastrar Cliente");
        System.out.println("[3] Cadastrar Processo");
        System.out.println("[4] Cadastrar Documento");
        System.out.println("[5] Agendar Compromisso");
        System.out.println("[6] Registrar Horas Trabalhadas");
        System.out.println("[7] Gerar Relatórios");
        System.out.println("[0] Sair");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarAdvogado();
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                cadastrarProcesso();
                break;
            case 4:
                cadastrarDocumento();
                break;
            case 5:
                agendarCompromisso();
                break;
            case 6:
                registrarHorasTrabalhadas();
                break;
            case 7:
                gerarRelatorios();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void cadastrarAdvogado() {
        System.out.println("Digite o nome do advogado:");
        String nome = scanner.nextLine();

        System.out.println("Digite a área de especialização do advogado:");
        String areaEspecializacao = scanner.nextLine();

        List<Processo> processosAtribuidos = new ArrayList<>();

        System.out.println("Digite as horas trabalhadas do advogado:");
        int horasTrabalhadas = scanner.nextInt();
        scanner.nextLine();

        Advogado advogado = new Advogado(nome, areaEspecializacao, processosAtribuidos, horasTrabalhadas);
        advogados.add(advogado);

        System.out.println("Advogado cadastrado com sucesso!");
    }

    public static void cadastrarCliente() {
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite as informações de contato do cliente:");
        String informacoesContato = scanner.nextLine();

        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();

        List<Processo> processosAssociados = new ArrayList<>();

        Cliente cliente = new Cliente(nome, informacoesContato, endereco, cpf, processosAssociados);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static void cadastrarProcesso() {
        System.out.println("Digite o número do processo:");
        int numeroProcesso = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite a descrição do caso:");
        String descricaoCaso = scanner.nextLine();

        System.out.println("Digite a data de abertura do processo:");
        String dataAbertura = scanner.nextLine();

        System.out.println("Digite o status do processo:");
        String status = scanner.nextLine();

        List<Documento> documentosAssociados = new ArrayList<>();

        Processo processo = new Processo(numeroProcesso, descricaoCaso, dataAbertura, status, documentosAssociados);
        processos.add(processo);

        System.out.println("Processo cadastrado com sucesso!");
    }

    public static void cadastrarDocumento() {
        System.out.println("Digite o número do documento:");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o tipo do documento:");
        String tipo = scanner.nextLine();

        System.out.println("Digite a data de criação do documento:");
        String data= scanner.nextLine();
        System.out.println("Digite a descrição do documento:");
        String descricao = scanner.nextLine();

        Documento documento = new Documento(titulo, tipo, data, descricao);
        documentos.add(documento);

        System.out.println("Documento cadastrado com sucesso!");
    }

    public static void agendarCompromisso() {
        System.out.println("Selecione um advogado para agendar o compromisso:");
        listarAdvogados();
        int indiceAdvogado = scanner.nextInt();
        scanner.nextLine(); 

        if (indiceAdvogado >= 0 && indiceAdvogado < advogados.size()) {
            Advogado advogadoSelecionado = advogados.get(indiceAdvogado);

            System.out.println("Digite a data do compromisso (DD/MM/AAAA):");
            String data = scanner.nextLine();

            System.out.println("Digite a hora do compromisso:");
            String hora = scanner.nextLine();

            System.out.println("Digite a descrição do compromisso:");
            String descricao = scanner.nextLine();

            Agenda compromisso = new Agenda(data, hora, descricao, advogadoSelecionado);
            agenda.add(compromisso);

            System.out.println("Compromisso agendado com sucesso!");
        } else {
            System.out.println("Advogado não encontrado.");
        }
    }

    public static void registrarHorasTrabalhadas() {
        System.out.println("Selecione um advogado para registrar horas trabalhadas:");
        listarAdvogados();
        int indiceAdvogado = scanner.nextInt();
        scanner.nextLine(); 

        if (indiceAdvogado >= 0 && indiceAdvogado < advogados.size()) {
            Advogado advogadoSelecionado = advogados.get(indiceAdvogado);

            System.out.println("Digite a quantidade de horas trabalhadas:");
            int horas = scanner.nextInt();
            scanner.nextLine(); 

            advogadoSelecionado.setHorasTrabalhadas(advogadoSelecionado.getHorasTrabalhadas() + horas);

            System.out.println("Horas registradas com sucesso!");
        } else {
            System.out.println("Advogado não encontrado.");
        }
    }

    public static void listarAdvogados() {
        System.out.println("Lista de Advogados:");
        for (int i = 0; i < advogados.size(); i++) {
            System.out.println(i + " - " + advogados.get(i).getNome());
        }
        System.out.println("===================");
    }

    public static void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i).getNome());
        }
        System.out.println("===================");
    }

    public static void listarProcessos() {
        System.out.println("Lista de Processos:");
        for (int i = 0; i < processos.size(); i++) {
            System.out.println(i + " - " + processos.get(i).getNumeroProcesso());
        }
        System.out.println("===================");
    }

    public static void listarDocumentos() {
        System.out.println("Lista de Documentos:");
        for (int i = 0; i < documentos.size(); i++) {
            System.out.println(i + " - " + documentos.get(i).getTituloDcumento());
        }
        System.out.println("===================");
    }

    public static void gerarRelatorios() {
        int opcao;
        do{
            System.out.println("============================");
            System.out.println("[1] Relatório de Advogados");
            System.out.println("[2] Relatório de Clientes");
            System.out.println("[3] Relatório de Processos");
            System.out.println("[4] Relatório de Documentos");
            System.out.println("[5] Relatório de Agenda");
            System.out.println("[0] Voltar");
            System.out.println("============================");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();
            scanner.nextLine();        
            switch (opcao) {
                case 1:
                    gerarRelatorioAdvogados();
                    break;
                case 2:
                    gerarRelatorioClientes();
                    break;
                case 3:
                    gerarRelatorioProcessos();
                    break;
                case 4:
                    gerarRelatorioDocumentos();
                    break;
                case 5:
                    gerarRelatorioAgenda();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void gerarRelatorioAdvogados() {
        System.out.println("Relatório de Advogados:");
        for (Advogado advogado : advogados) {
            System.out.println("Nome: " + advogado.getNome());
            System.out.println("Área de Especialização: " + advogado.getAreaEspecializacao());
            System.out.println("Horas Trabalhadas: " + advogado.getHorasTrabalhadas());
            System.out.println("============================");
        }
    }

    public static void gerarRelatorioClientes() {
        System.out.println("Relatório de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Informações de Contato: " + cliente.getInformacoesContato());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("CPF: " + cliente.getCPF());
            System.out.println("============================");
        }
    }

    public static void gerarRelatorioProcessos() {
        System.out.println("Relatório de Processos:");
        for (Processo processo : processos) {
            System.out.println("Número do Processo: " + processo.getNumeroProcesso());
            System.out.println("Descrição do Caso: " + processo.getDescricaoCaso());
            System.out.println("Data de Abertura: " + processo.getDataAbertura());
            System.out.println("Status: " + processo.getStatus());
            System.out.println("============================");
        }
    }

    public static void gerarRelatorioDocumentos() {
        System.out.println("Relatório de Documentos:");
        for (Documento documento : documentos) {
            System.out.println("Título: " + documento.getTituloDcumento());
            System.out.println("Tipo: " + documento.getTipoDocumento());
            System.out.println("Data de Criação: " + documento.getDataCriacao());
            System.out.println("Descrição: " + documento.getDescricao());
            System.out.println("============================");
        }
    }

    public static void gerarRelatorioAgenda() {
        System.out.println("Relatório de Compromissos:");
        for (Agenda compromisso : agenda) {
            System.out.println("Data: " + compromisso.getData());
            System.out.println("Hora: " + compromisso.getHora());
            System.out.println("Descrição: " + compromisso.getDescricaoCompromisso());
            System.out.println("Advogado: " + compromisso.getAdvogado().getNome());
            System.out.println("============================");
        }
    }

}
