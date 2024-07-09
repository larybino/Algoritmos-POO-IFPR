package academia;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class App {
    private static List<Membro> membros = new ArrayList<>();
    private static List<Instrutor> instrutores = new ArrayList<>();
    private static List<Aula> aulas = new ArrayList<>();
    private static List<Pagamento> pagamentos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenuPrincipal();
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("============================");
        System.out.println("Sistema de Gerenciamento de Academia");
        System.out.println("============================");
        System.out.println("[1] Criar novo membro");
        System.out.println("[2] Criar novo instrutor");
        System.out.println("[3] Agendar aula");
        System.out.println("[4] Criar plano de treinamento");
        System.out.println("[5] Pagar mensalidade");
        System.out.println("[6] Gerar relatórios");
        System.out.println("[0] Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                criarNovoMembro();
                break;
            case 2:
                criarNovoInstrutor();
                break;
            case 3:
                agendarAula();
                break;
            case 4:
                criarPlanoDeTreinamento();
                break;
            case 5:
                pagarMensalidade();
                break;
            case 6:
                gerarRelatorios();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static void criarNovoMembro() {
        System.out.print("Digite o nome do membro: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o email do membro: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone do membro: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite a data de nascimento do membro: ");
        String dataNascimento = scanner.nextLine();
        System.out.print("Digite o genero do membro: ");
        String genero = scanner.nextLine();
        System.out.print("Digite a altura do membro: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o peso do membro: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Membro membro = new Membro(nome, email, telefone, dataNascimento, genero, altura, peso);
        membros.add(membro);

        System.out.println("Membro cadastrado com sucesso!");
    }

    private static void criarNovoInstrutor() {
        System.out.print("Digite o nome do instrutor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite as horas de trabalho do instrutor: ");
        String horarioTrabalho = scanner.nextLine();

        Instrutor instrutor = new Instrutor(nome, horarioTrabalho);
        instrutores.add(instrutor);

        System.out.println("Instrutor cadastrado com sucesso!");
    }

    private static void agendarAula() {
        System.out.print("Digite o nome da aula: ");
        String nomeAula = scanner.nextLine();
        System.out.print("Digite o horário da aula: ");
        String horario = scanner.nextLine();
        System.out.print("Digite a duração da aula: ");
        int duracao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a capacidade máxima da aula: ");
        int capacidadeMax = scanner.nextInt();
        scanner.nextLine();
        
        if (instrutores.isEmpty()) {
            System.out.println("Não há instrutores cadastrados.");
            return;
        }

        System.out.println("Selecione o instrutor:");
        for (int i = 0; i < instrutores.size(); i++) {
            System.out.println((i + 1) + ". " + instrutores.get(i).getNome());
        }
        int indexInstrutor = scanner.nextInt();
        scanner.nextLine(); 

        if (indexInstrutor < 1 || indexInstrutor > instrutores.size()) {
            System.out.println("Índice de instrutor inválido.");
            return;
        }

        Instrutor instrutor = instrutores.get(indexInstrutor - 1);
        Aula aula = new Aula(nomeAula, horario, duracao, capacidadeMax, instrutor);
        aulas.add(aula);

        System.out.println("Aula agendada com sucesso!");
    }

    private static void criarPlanoDeTreinamento() {
        if (membros.isEmpty()) {
            System.out.println("Não há membros cadastrados.");
            return;
        }

        if (instrutores.isEmpty()) {
            System.out.println("Não há instrutores cadastrados.");
            return;
        }

        System.out.println("Selecione o membro:");
        for (int i = 0; i < membros.size(); i++) {
            System.out.println((i + 1) + ". " + membros.get(i).getNome());
        }
        int indexMembro = scanner.nextInt();
        scanner.nextLine(); 
        if (indexMembro < 1 || indexMembro > membros.size()) {
            System.out.println("Índice de membro inválido.");
            return;
        }

        Membro membro = membros.get(indexMembro - 1);

        System.out.println("Selecione o instrutor:");
        for (int i = 0; i < instrutores.size(); i++) {
            System.out.println((i + 1) + ". " + instrutores.get(i).getNome());
        }
        int indexInstrutor = scanner.nextInt();
        scanner.nextLine(); 

        if (indexInstrutor < 1 || indexInstrutor > instrutores.size()) {
            System.out.println("Índice de instrutor inválido.");
            return;
        }

        Instrutor instrutor = instrutores.get(indexInstrutor - 1);

        System.out.print("Digite o tipo do plano de treinamento: ");
        String nomeplano = scanner.nextLine();
        System.out.print("Digite a descrição do plano de treinamento: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite a duração do plano de treinamento: ");
        int duracaoPlano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a frequencia do plano de treinamento: ");
        int frequencia = scanner.nextInt();
        scanner.nextLine();


        Treinamento treinamento = new Treinamento(nomeplano, descricao, duracaoPlano, frequencia, instrutor, membro);
        instrutor.adicionarTreinamento(treinamento);
        membro.setTreinamento(treinamento);

        System.out.println("Plano de treinamento criado com sucesso!");
    }

    private static void pagarMensalidade() {
        if (membros.isEmpty()) {
            System.out.println("Não há membros cadastrados.");
            return;
        }

        System.out.println("Selecione o membro:");
        for (int i = 0; i < membros.size(); i++) {
            System.out.println((i + 1) + ". " + membros.get(i).getNome());
        }
        int indexMembro = scanner.nextInt();
        scanner.nextLine(); 

        if (indexMembro < 1 || indexMembro > membros.size()) {
            System.out.println("Índice de membro inválido.");
            return;
        }

        Membro membro = membros.get(indexMembro - 1);

        System.out.print("Digite o valor da mensalidade: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Digite a data de pagamento: ");
        String dataPagamento = scanner.nextLine();

      

        Pagamento pagamento = new Pagamento(membro, valor, dataPagamento);
        pagamentos.add(pagamento);

        System.out.println("Mensalidade paga com sucesso!");
    }

    private static void gerarRelatorios() {
        int opcao;
        do{
            System.out.println("============================");
            System.out.println("Geração de Relatórios");
            System.out.println("============================");
            System.out.println("[1] Relatório de Membros");
            System.out.println("[2] Relatório de Instrutores");
            System.out.println("[3] Relatório de Aulas");
            System.out.println("[4] Relatório de Pagamentos");
            System.out.println("[0] Voltar");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    gerarRelatorioMembros();
                    break;
                case 2:
                    gerarRelatorioInstrutores();
                    break;
                case 3:
                    gerarRelatorioAulas();
                    break;
                case 4:
                    gerarRelatorioPagamentos();
                    break;
                case 0:
                    System.out.println("Retornando ao Menu Principal...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
    }

    private static void gerarRelatorioMembros() {
        System.out.println("Relatório de Membros:");
        for (Membro membro : membros) {
            System.out.println("Nome: " + membro.getNome());
            System.out.println("Email: " + membro.getEmail());
            System.out.println("Telefone: " + membro.getTelefone());
            System.out.println("Data de Nascimento: " + membro.getDataNascimento());
            System.out.println("Gênero: " + membro.getGenero());
            System.out.println("Altura: " + membro.getAltura());
            System.out.println("Peso: " + membro.getPeso());
            System.out.println("Treinamento: " + (membro.getTreinamento() != null ? membro.getTreinamento().getNomePlano() : "Nenhum"));
            System.out.println("============================");
        }
    }

    private static void gerarRelatorioInstrutores() {
        System.out.println("Relatório de Instrutores:");
        for (Instrutor instrutor : instrutores) {
            System.out.println("Nome: " + instrutor.getNome());
            System.out.println("Horas de Trabalho: " + instrutor.getHorarioTrabalho());
            System.out.println("Treinamentos: ");
        for (Treinamento treinamento : instrutor.getTreinamento()) {
                System.out.println(" - " + treinamento.getNomePlano() + " (Membro: " + treinamento.getMembro().getNome() + ")");
            }
            System.out.println("============================");
        }
    }

    private static void gerarRelatorioAulas() {
        System.out.println("Relatório de Aulas:");
        for (Aula aula : aulas) {
            System.out.println("Nome da Aula: " + aula.getTipoAula());
            System.out.println("Horário: " + aula.getHorario());
            System.out.println("Duração: " + aula.getDuracao() + " minutos");
            System.out.println("Capacidade Máxima: " + aula.getCapacidadeMaximaParticipantes());
            System.out.println("Instrutor: " + aula.getInstrutor().getNome());
            System.out.println("============================");
        }
    }

    private static void gerarRelatorioPagamentos() {
        System.out.println("Relatório de Pagamentos:");
        for (Pagamento pagamento : pagamentos) {
            System.out.println("Membro: " + pagamento.getMembro().getNome());
            System.out.println("Valor: R$ " + pagamento.getValor());
            System.out.println("Data de Pagamento: " + pagamento.getDataPagamento());
            System.out.println("============================");
        }
    }
}
