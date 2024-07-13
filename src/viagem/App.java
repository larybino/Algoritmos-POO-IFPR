package viagem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Voo> voos = new ArrayList<>();
    static ArrayList<Reserva> reservas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int proximoCodigoReserva = 1;

    public static void main(String[] args) {
        popularVoos();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    listarVoosDisponiveis();
                    break;
                case 2:
                    realizarReserva();
                    break;
                case 3:
                    exibirReservas();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void popularVoos() {
        //voos pré-cadastrados
        voos.add(new Voo("LATAM", "São Paulo", "Rio de Janeiro", "08:00", "09:00", 250.0, 50));
        voos.add(new Voo("GOL", "São Paulo", "Brasília", "10:00", "12:00", 350.0, 30));
        voos.add(new Voo("Azul", "Rio de Janeiro", "Salvador", "14:00", "16:00", 450.0, 20));
    }

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Listar Voos Disponíveis");
        System.out.println("[2] Realizar Reserva");
        System.out.println("[3] Exibir Reservas");
        System.out.println("[0] Sair");
        System.out.println("============================");
        System.out.print("Escolha uma opção: ");
    }

    public static void listarVoosDisponiveis() {
        System.out.println("Voos Disponíveis:");
        for (int i = 0; i < voos.size(); i++) {
            Voo voo = voos.get(i);
            System.out.println("---------------------------------------");
            System.out.println("Número do Voo: " + (i + 1));
            System.out.println("Companhia Aérea: " + voo.getCompanhiaAerea());
            System.out.println("Origem: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Horário de Partida: " + voo.getHorarioPartida());
            System.out.println("Horário de Chegada: " + voo.getHorarioChegada());
            System.out.println("Preço: R$ " + voo.getPreco());
            System.out.println("Assentos Disponíveis: " + voo.getAssentosDisponiveis());
            System.out.println("---------------------------------------");
        }
    }

    public static void realizarReserva() {
        scanner.nextLine(); 
    
        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
    
        System.out.print("Digite seu e-mail: ");
        String emailCliente = scanner.nextLine();
    
        listarVoosDisponiveis();
        System.out.print("Digite o número do voo desejado: ");
        int numeroVoo = scanner.nextInt();
    
        Voo vooSelecionado = voos.get(numeroVoo - 1);
        System.out.print("Digite a quantidade de assentos desejada: ");
        int quantidadeAssentos = scanner.nextInt();
    
        if (vooSelecionado.getAssentosDisponiveis() >= quantidadeAssentos) {
            String codigoReserva = gerarCodigoReserva();
            Cliente cliente = new Cliente(nomeCliente, emailCliente); 
            Reserva reserva = new Reserva(cliente, vooSelecionado, new ArrayList<>(), codigoReserva, quantidadeAssentos);
            reservas.add(reserva);
    
            
            vooSelecionado.setAssentosDisponiveis(vooSelecionado.getAssentosDisponiveis() - quantidadeAssentos);
    
            System.out.println("Reserva realizada com sucesso!");
            System.out.println("Código da Reserva: " + codigoReserva);
        } else {
            System.out.println("Não há assentos suficientes disponíveis para este voo.");
        }
    }
    

    public static void exibirReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Não há reservas realizadas.");
        } else {
            System.out.println("Reservas Realizadas:");
            for (Reserva reserva : reservas) {
                System.out.println("---------------------------------------");
                System.out.println("Código da Reserva: " + reserva.getCodigoReserva());
                System.out.println("Nome do Cliente: " + reserva.getCliente().getNome());
                System.out.println("E-mail do Cliente: " + reserva.getCliente().getEmail());
                System.out.println("Voo: " + reserva.getVoo().getCompanhiaAerea() + " - " +
                                   reserva.getVoo().getOrigem() + " -> " + reserva.getVoo().getDestino());
                System.out.println("Quantidade de Assentos: " + reserva.getQuantidadeAssentos());
                System.out.println("---------------------------------------");
            }
        }
    }

    public static String gerarCodigoReserva() {
        return "R" + proximoCodigoReserva++;
    }
}
