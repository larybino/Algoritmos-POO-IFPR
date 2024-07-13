package redesocial;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Grupo> grupos = new ArrayList<>();

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("============================");
            System.out.println("Sistema de Gerenciamento de Rede Social");
            System.out.println("============================");
            System.out.println("[1] Criar novo usuário");
            System.out.println("[2] Criar novo grupo");
            System.out.println("[3] Fazer uma postagem");
            System.out.println("[4] Enviar mensagem");
            System.out.println("[5] Gerenciar amigos/seguidores");
            System.out.println("[0] Sair");
            System.out.println("============================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarNovoUsuario();
                    break;
                case 2:
                    criarNovoGrupo();
                    break;
                case 3:
                    fazerPostagem();
                    break;
                case 4:
                    enviarMensagem();
                    break;
                case 5:
                    gerenciarAmigosSeguidores();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void cadastrarNovoUsuario() {
        System.out.println("Digite o nome de usuário:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite o nome real:");
        String nomeReal = scanner.nextLine();

        System.out.println("Digite as informações pessoais:");
        String informacoesPessoais = scanner.nextLine();

        List<Seguidor> amigosSefuidores = new ArrayList<>();


        Usuario novoUsuario = new Usuario(nomeUsuario, nomeReal, informacoesPessoais, amigosSefuidores);
        usuarios.add(novoUsuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void criarNovoGrupo() {
        System.out.println("Digite o nome do grupo:");
        String nomeGrupo = scanner.nextLine();

        System.out.println("Digite a descrição do grupo:");
        String descricaoGrupo = scanner.nextLine();

        Grupo novoGrupo = new Grupo(nomeGrupo, descricaoGrupo, 0, 0); //sem membros e publicações
        grupos.add(novoGrupo);

        System.out.println("Grupo criado com sucesso!");
    }

    private static void fazerPostagem() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados para fazer postagens.");
            return;
        }
    
        System.out.println("Selecione o autor da postagem:");
        listarUsuarios();
        int indexAutor = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexAutor < 1 || indexAutor > usuarios.size()) {
            System.out.println("Índice de usuário inválido.");
            return;
        }
    
        Usuario autor = usuarios.get(indexAutor - 1);
    
        System.out.println("Digite o conteúdo da postagem:");
        String conteudo = scanner.nextLine();
    
        String dataAtual = "01/07/2024";
        String horaAtual = "12:00";
    
        Postagem postagem = new Postagem(conteudo, dataAtual, horaAtual, 0, 0); //sem curtidas e comentários
    
        autor.adicionarPostagem(postagem);
    
        System.out.println("Postagem adicionada com sucesso!");
    }
    
    

    private static void enviarMensagem() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados para enviar mensagens.");
            return;
        }
    
        System.out.println("Selecione o remetente da mensagem:");
        listarUsuarios();
        int indexRemetente = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexRemetente < 1 || indexRemetente > usuarios.size()) {
            System.out.println("Índice de usuário inválido.");
            return;
        }
    
        Usuario remetente = usuarios.get(indexRemetente - 1);
    
        System.out.println("Selecione o destinatário da mensagem:");
        listarUsuarios();
        int indexDestinatario = scanner.nextInt();
        scanner.nextLine(); 
    
        if (indexDestinatario < 1 || indexDestinatario > usuarios.size()) {
            System.out.println("Índice de usuário inválido.");
            return;
        }
    
        Usuario destinatario = usuarios.get(indexDestinatario - 1);
    
        System.out.println("Digite o conteúdo da mensagem:");
        String conteudo = scanner.nextLine();
    
        String dataAtual = "01/07/2024";
        String horaAtual = "12:00";
    
        Mensagem mensagem = new Mensagem(destinatario.getNomeUsuario(), conteudo, dataAtual, horaAtual, "Enviada"); //status inicial da mensagem
    
        remetente.adicionarMensagem(mensagem);
    
        System.out.println("Mensagem enviada com sucesso!");
    }
    

    private static void gerenciarAmigosSeguidores() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados para gerenciar amigos/seguidores.");
            return;
        }

        System.out.println("Selecione o usuário para gerenciar amigos/seguidores:");
        listarUsuarios();
        int indexUsuario = scanner.nextInt();
        scanner.nextLine(); 

        if (indexUsuario < 1 || indexUsuario > usuarios.size()) {
            System.out.println("Índice de usuário inválido.");
            return;
        }

        Usuario usuario = usuarios.get(indexUsuario - 1);

        System.out.println("[1] Adicionar amigo/seguidor");
        System.out.println("[2] Remover amigo/seguidor");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                adicionarAmigoSeguidor(usuario);
                break;
            case 2:
                removerAmigoSeguidor(usuario);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }


private static void adicionarAmigoSeguidor(Usuario usuario) {
    System.out.println("Selecione o amigo/seguidor para adicionar:");
    listarUsuarios();
    int indexAmigoSeguidor = scanner.nextInt();
    scanner.nextLine(); 

    if (indexAmigoSeguidor < 1 || indexAmigoSeguidor > usuarios.size()) {
        System.out.println("Índice de usuário inválido.");
        return;
    }

    Usuario amigoSeguidor = usuarios.get(indexAmigoSeguidor - 1);

    if (usuario.equals(amigoSeguidor)) {
        System.out.println("Você não pode adicionar a si mesmo como amigo/seguidor.");
        return;
    }

    String dataAtual = "01/07/2024";

    Seguidor novoSeguidor = new Seguidor(amigoSeguidor.getNomeUsuario(), dataAtual, "Seguindo", "");
    usuario.adicionarAmigoSeguidor(novoSeguidor);

    System.out.println("Amigo/seguidor adicionado com sucesso!");
}


    private static void removerAmigoSeguidor(Usuario usuario) {
        if (usuario.getAmigosSeguidores().isEmpty()) {
            System.out.println("O usuário não possui amigos/seguidores para remover.");
            return;
        }

        System.out.println("Selecione o amigo/seguidor para remover:");
        listarAmigosSeguidores(usuario);
        int indexAmigoSeguidor = scanner.nextInt();
        scanner.nextLine(); 

        if (indexAmigoSeguidor < 1 || indexAmigoSeguidor > usuario.getAmigosSeguidores().size()) {
            System.out.println("Índice de amigo/seguidor inválido.");
            return;
        }

        usuario.removerAmigoSeguidor(usuario.getAmigosSeguidores().get(indexAmigoSeguidor - 1));

        System.out.println("Amigo/seguidor removido com sucesso!");
    }

    private static void listarUsuarios() {
        System.out.println("=== Usuários ===");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i).getNomeUsuario());
        }
        System.out.println("================");
    }

    private static void listarAmigosSeguidores(Usuario usuario) {
        System.out.println("=== Amigos/Seguidores de " + usuario.getNomeUsuario() + " ===");
        List<Seguidor> amigosSeguidores = usuario.getAmigosSeguidores();
        for (int i = 0; i < amigosSeguidores.size(); i++) {
            System.out.println((i + 1) + ". " + amigosSeguidores.get(i).getSeguidor());
        }
        System.out.println("============================");
    }
}
