package turismo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Turista> turistas = new ArrayList<>();
    private static final Idiomas idiomas;
    private static final Seguranca seguranca;

    static {
        ArrayList<String> idiomasSuportados = new ArrayList<>();
        idiomasSuportados.add("Inglês");
        idiomasSuportados.add("Espanhol");

        ArrayList<String> dicionariosVocabulario = new ArrayList<>();
        dicionariosVocabulario.add("Português-Inglês");
        dicionariosVocabulario.add("Português-Espanhol");

        idiomas = new Idiomas(idiomasSuportados, "Habilitada", dicionariosVocabulario,
                "Últimas atualizações em janeiro de 2023", "Novos idiomas estão sendo adicionados constantemente.");

        seguranca = new Seguranca("Equipe de segurança altamente treinada", "Protocolo rigoroso para emergências",
                "Medidas de evacuação e primeiros socorros", "Mapa das áreas seguras disponível para todos",
                "Canais de comunicação direta com centros de emergência");
    }

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("============================");
            System.out.println("Sistema de Gerenciamento de Turistas Alienígenas");
            System.out.println("============================");
            System.out.println("[1] Registrar Turista");
            System.out.println("[2] Adicionar Acomodação");
            System.out.println("[3] Agendar Passeio");
            System.out.println("[4] Mostrar Informações do Turista");
            System.out.println("[0] Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    registrarTurista();
                    break;
                case 2:
                    adicionarAcomodacao();
                    break;
                case 3:
                    agendarPasseio();
                    break;
                case 4:
                    mostrarInformacoesTurista();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void registrarTurista() {
        System.out.println("Digite o nome do turista:");
        String nome = scanner.nextLine();
        System.out.println("Digite a origem do turista:");
        String origem = scanner.nextLine();
        System.out.println("Digite a especie do turista:");
        String especie = scanner.nextLine();
        System.out.println("Digite a data de chegada do turista:");
        String dataChegada = scanner.nextLine();
        System.out.println("Digite o período de estadia do turista:");
        int periodoEstadia = scanner.nextInt();
        scanner.nextLine();

        Turista turista = new Turista(nome, origem, especie, dataChegada, periodoEstadia);
        turistas.add(turista);

        System.out.println("Turista registrado com sucesso!");
    }

    private static void adicionarAcomodacao() {
        if (turistas.isEmpty()) {
            System.out.println("Não há turistas registrados. Registre um turista primeiro.");
            return;
        }

        System.out.println("Selecione o turista:");
        listarTuristas();

        int indexTurista = scanner.nextInt();
        scanner.nextLine(); 

        if (indexTurista < 1 || indexTurista > turistas.size()) {
            System.out.println("Índice de turista inválido.");
            return;
        }

        Turista turista = turistas.get(indexTurista - 1);

        System.out.println("Digite o nome da acomodação:");
        String tipoAcomodacao = scanner.nextLine();
        System.out.println("Digite a localização da acomodação:");
        String localizacao = scanner.nextLine();
        System.out.println("Digite se os quartos estão disponíveis:");
        String disponibilidade = scanner.nextLine();
        System.out.println("Digite a capacidade da acomodação:");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o valor da acomodação:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 


        Acomodacao acomodacao = new Acomodacao(tipoAcomodacao, localizacao, disponibilidade, capacidade, preco);
        turista.reservarAcomodacao(acomodacao);

        System.out.println("Acomodação adicionada com sucesso para o turista " + turista.getNome() + ".");
    }    

    private static void agendarPasseio() {
        if (turistas.isEmpty()) {
            System.out.println("Não há turistas registrados. Registre um turista primeiro.");
            return;
        }

        System.out.println("Selecione o turista:");
        listarTuristas();

        int indexTurista = scanner.nextInt();
        scanner.nextLine(); 

        if (indexTurista < 1 || indexTurista > turistas.size()) {
            System.out.println("Índice de turista inválido.");
            return;
        }

        Turista turista = turistas.get(indexTurista - 1);

        System.out.println("Digite o nome do passeio:");
        String nome = scanner.nextLine();
        System.out.println("Descreva o passeio:");
        String descricao = scanner.nextLine();
        System.out.println("Duração do passeio:");
        int duracao = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("Localização do passeio:");
        String localizacao = scanner.nextLine();
        System.out.println("Digite o preço do passeio:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("O passeio está disponível? (true/false):");
        String disponivel = scanner.nextLine();

        Passeio passeio = new Passeio(nome, descricao, duracao, localizacao, preco, disponivel);
        turista.agendarPasseio(passeio);

        System.out.println("Passeio agendado com sucesso para o turista " + turista.getNome() + ".");
    }


    private static void mostrarInformacoesTurista() {
        if (turistas.isEmpty()) {
            System.out.println("Não há turistas registrados.");
            return;
        }

        System.out.println("Selecione o turista:");
        listarTuristas();

        int indexTurista = scanner.nextInt();
        scanner.nextLine(); 

        if (indexTurista < 1 || indexTurista > turistas.size()) {
            System.out.println("Índice de turista inválido.");
            return;
        }

        Turista turista = turistas.get(indexTurista - 1);

        System.out.println("Informações do Turista:");
        System.out.println("Nome: " + turista.getNome());
        System.out.println("Origem: " + turista.getOrigem());
        System.out.println("Espécie: " + turista.getEspecie());

        System.out.println("\nAcomodações selecionadas:");
        for (Acomodacao acomodacao : turista.getAcomodacoes()) {
            System.out.println("- " + acomodacao.getTipoAcomodacao());
            System.out.println("   Localização: " + acomodacao.getLocalizacao());
            System.out.println("   Capacidade: " + acomodacao.getCapacidadeOcupacao());
            System.out.println("   Quartos disponíveis: " + acomodacao.getDisponibilidade());
        }

        System.out.println("\nPasseios agendados:");
        for (Passeio passeio : turista.getPasseios()) {
            System.out.println("- " + passeio.getNome());
            System.out.println("   Descrição: " + passeio.getDescricao());
            System.out.println("   Preço: R$ " + passeio.getPreco());
            System.out.println("   Disponível: " + (passeio.getDisponibilidade()));
        }

        System.out.println("\nInformações de idiomas e tradução:");
        System.out.println("Idiomas suportados: " + idiomas.getIdiomasSuportados());
        System.out.println("Tradução automática: " + idiomas.getTraducaoAutomatica());
        System.out.println("Dicionários de vocabulário: " + idiomas.getDicionariosVocabulario());
        System.out.println("Traduções anteriores: " + idiomas.getTraducoesAnteriores());
        System.out.println("Atualizações de idiomas: " + idiomas.getAtualizacoesIdiomas());

        System.out.println("\nInformações de segurança:");
        System.out.println("Equipe de segurança: " + seguranca.getEquipeSeguranca());
        System.out.println("Protocolo de segurança: " + seguranca.getProtocoloSeguranca());
        System.out.println("Medidas de emergência: " + seguranca.getMedidasEmergencia());
        System.out.println("Áreas seguras: " + seguranca.getInformacoesAreasSeguras());
        System.out.println("Comunicação em emergências: " + seguranca.getComunicacaoEmergencias());
    }

    private static void listarTuristas() {
        for (int i = 0; i < turistas.size(); i++) {
            System.out.println((i + 1) + ". " + turistas.get(i).getNome());
        }
        System.out.print("Escolha um turista: ");
    }
}
