package adocaoarvore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Arvore> arvores = new ArrayList<>();
    private static final List<Adotante> adotantes = new ArrayList<>();
    private static final List<Plantio> plantios = new ArrayList<>();
    private static final List<Adocao> adocoes = new ArrayList<>();

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("============================");
            System.out.println("Sistema de Adoção de Árvores");
            System.out.println("============================");
            System.out.println("[1] Cadastrar Árvore");
            System.out.println("[2] Registrar Adotante");
            System.out.println("[3] Adotar Árvore");
            System.out.println("[4] Registrar Cuidado de Árvore");
            System.out.println("[5] Registrar Plantio de Árvore");
            System.out.println("[6] Mostrar Informações de Árvore");
            System.out.println("[0] Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarArvore();
                    break;
                case 2:
                    registrarAdotante();
                    break;
                case 3:
                    adotarArvore();
                    break;
                case 4:
                    registrarCuidadoArvore();
                    break;
                case 5:
                    registrarPlantioArvore();
                    break;
                case 6:
                    mostrarInformacoesArvore();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarArvore() {
        System.out.println("Digite a espécie da árvore:");
        String especie = scanner.nextLine();
        System.out.println("Digite a localização da árvore:");
        String localizacao = scanner.nextLine();
        System.out.println("Digite o estado de saúde da árvore:");
        String saude = scanner.nextLine();
        System.out.println("Digite a idade da árvore:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        Arvore arvore = new Arvore(especie,localizacao, saude, idade);
        arvores.add(arvore);

        System.out.println("Árvore cadastrada com sucesso!");
    }

    private static void registrarAdotante() {
        System.out.println("Digite o nome do adotante:");
        String nome = scanner.nextLine();
        System.out.println("Digite o contato do adotante:");
        String contato = scanner.nextLine();
        System.out.println("Digite o endereço do adotante:");
        String endereco = scanner.nextLine();

        Adotante adotante = new Adotante(nome, contato, endereco);
        adotantes.add(adotante);

        System.out.println("Adotante registrado com sucesso!");
    }

    private static void adotarArvore() {
        if (arvores.isEmpty()) {
            System.out.println("Não há árvores cadastradas. Cadastre uma árvore primeiro.");
            return;
        }

        System.out.println("Selecione a árvore:");
        listarArvores();

        int indexArvore = scanner.nextInt();
        scanner.nextLine(); 

        if (indexArvore < 1 || indexArvore > arvores.size()) {
            System.out.println("Índice de árvore inválido.");
            return;
        }

        Arvore arvore = arvores.get(indexArvore - 1);

        System.out.println("Selecione o adotante:");
        listarAdotantes();

        int indexAdotante = scanner.nextInt();
        scanner.nextLine(); 

        if (indexAdotante < 1 || indexAdotante > adotantes.size()) {
            System.out.println("Índice de adotante inválido.");
            return;
        }

        Adotante adotante = adotantes.get(indexAdotante - 1);
        adotante.adotarArvore(arvore);

        String dataAdocao = scanner.nextLine(); 
        Adocao adocao = new Adocao(adotante.getNome(), arvore.getEspecie(), dataAdocao, "Adotada");
        adocoes.add(adocao);

        System.out.println("Árvore adotada com sucesso por " + adotante.getNome() + ".");
    }

    private static void registrarCuidadoArvore() {
        if (arvores.isEmpty()) {
            System.out.println("Não há árvores cadastradas. Cadastre uma árvore primeiro.");
            return;
        }

        System.out.println("Selecione a árvore:");
        listarArvores();

        int indexArvore = scanner.nextInt();
        scanner.nextLine(); 

        if (indexArvore < 1 || indexArvore > arvores.size()) {
            System.out.println("Índice de árvore inválido.");
            return;
        }

        Arvore arvore = arvores.get(indexArvore - 1);

        System.out.println("Digite o tipo de cuidado:");
        String tipoCuidado = scanner.nextLine();
        System.out.println("Digite a data do cuidado (AAAA-MM-DD):");
        String dataHora = scanner.nextLine();
        System.out.println("Digite observações sobre o cuidado:");
        String observacoes = scanner.nextLine();

        Cuidado cuidado = new Cuidado(tipoCuidado, dataHora, observacoes);
        adotantes.forEach(adotante -> adotante.registrarCuidadoArvore(arvore, cuidado));

        System.out.println("Cuidado registrado com sucesso para a árvore " + arvore.getEspecie() + ".");
    }

    private static void registrarPlantioArvore() {
        System.out.println("Digite a localização do plantio:");
        String localizacao = scanner.nextLine();
        System.out.println("Digite a espécie da árvore plantada:");
        String especie = scanner.nextLine();
        System.out.println("Digite a data do plantio (AAAA-MM-DD):");
        String dataPlantio = scanner.nextLine();
        System.out.println("Digite o responsável pelo plantio:");
        String responsavelPlantio = scanner.nextLine();
        System.out.println("Condições do solo no momento do plantio:");
        String condicoesSolo = scanner.nextLine();
        System.out.println("Condições climáticas no momento do plantio:");
        String condicoesClimaticas = scanner.nextLine();

        Plantio plantio = new Plantio(localizacao, especie, dataPlantio, responsavelPlantio, condicoesSolo, condicoesClimaticas);
        plantios.add(plantio);

        System.out.println("Plantio registrado com sucesso!");
    }

    private static void mostrarInformacoesArvore() {
        if (arvores.isEmpty()) {
            System.out.println("Não há árvores cadastradas.");
            return;
        }

        System.out.println("Selecione a árvore:");
        listarArvores();

        int indexArvore = scanner.nextInt();
        scanner.nextLine(); 

        if (indexArvore < 1 || indexArvore > arvores.size()) {
            System.out.println("Índice de árvore inválido.");
            return;
        }

        Arvore arvore = arvores.get(indexArvore - 1);

        System.out.println("Informações da Árvore:");
        System.out.println("Espécie: " + arvore.getEspecie());
        System.out.println("Idade: " + arvore.getIdade());
        System.out.println("Localização: " + arvore.getLocalizacao());
        System.out.println("Estado de Saúde: " + arvore.getSaude());

        List<Cuidado> cuidados = arvore.getHistoricoCuidados();
        if (!cuidados.isEmpty()) {
            System.out.println("Histórico de Cuidados:");
            for (Cuidado cuidado : cuidados) {
                System.out.println("- Tipo: " + cuidado.getTipoCuidado());
                System.out.println("  Data e Hora: " + cuidado.getData());
                System.out.println("  Observações: " + cuidado.getDescricao());
            }
        }

        System.out.println("Adotantes:");
        boolean adotado = false;
        for (Adotante adotante : adotantes) {
            List<Arvore> arvoresAdotadas = adotante.getArvoresAdotadas();
            for (Arvore a : arvoresAdotadas) {
                if (a.equals(arvore)) {
                    System.out.println("- " + adotante.getNome());
                    adotado = true;
                    break;
                }
            }
        }
        if (!adotado) {
            System.out.println("- Nenhum adotante registrado.");
        }

        System.out.println("Plantios Relacionados:");
        boolean plantado = false;
        for (Plantio plantio : plantios) {
            if (plantio.getEspecie().equalsIgnoreCase(arvore.getEspecie())) {
                System.out.println("- Localização: " + plantio.getLocalizacao());
                System.out.println("  Data de Plantio: " + plantio.getDataPlantio());
                System.out.println("  Responsável: " + plantio.getResponsavelPlantio());
                plantado = true;
            }
        }
        if (!plantado) {
            System.out.println("- Nenhum plantio registrado para esta espécie.");
        }
    }

    private static void listarArvores() {
        for (int i = 0; i < arvores.size(); i++) {
            Arvore arvore = arvores.get(i);
            System.out.println((i + 1) + ". Espécie: " + arvore.getEspecie() + ", Localização: " + arvore.getLocalizacao());
        }
        System.out.print("Escolha uma árvore: ");
    }

    private static void listarAdotantes() {
        for (int i = 0; i < adotantes.size(); i++) {
            Adotante adotante = adotantes.get(i);
            System.out.println((i + 1) + ". Nome: " + adotante.getNome() + ", Contato: " + adotante.getInformacoesContato());
        }
        System.out.print("Escolha um adotante: ");
    }
}

        
            
