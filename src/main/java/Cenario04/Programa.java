package src.main.java.Cenario04;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    entrarVeiculo(estacionamento, scanner);
                    break;
                case 2:
                    sairVeiculo(estacionamento, scanner);
                    break;
                case 3:
                    exibirStatus(estacionamento);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Entrar Veículo");
        System.out.println("2 - Sair Veículo");
        System.out.println("3 - Exibir Status do Estacionamento");
        System.out.println("4 - Sair");
        System.out.print("Opção: ");
    }

    private static void entrarVeiculo(Estacionamento estacionamento, Scanner scanner) {
        System.out.print("Modelo do Veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa do Veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Cor do Veículo: ");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        if (estacionamento.entrar(veiculo)) {
            System.out.println("Veículo estacionado com sucesso!");
        } else {
            System.out.println("Estacionamento lotado. Não foi possível estacionar o veículo.");
        }
    }

    private static void sairVeiculo(Estacionamento estacionamento, Scanner scanner) {
        System.out.print("Placa do Veículo: ");
        String placa = scanner.nextLine();

        if (estacionamento.sair(placa)) {
            System.out.println("Veículo retirado do estacionamento com sucesso!");
        } else {
            System.out.println("Veículo com placa '" + placa + "' não encontrado no estacionamento.");
        }
    }

    private static void exibirStatus(Estacionamento estacionamento) {
        System.out.println("\nStatus do Estacionamento:");
        System.out.println("Total de vagas: " + estacionamento.getTotalVagas());
        System.out.println("Vagas ocupadas: " + estacionamento.getVagasOcupadas());
        System.out.println("Vagas disponíveis: " + estacionamento.getVagasDisponiveis());
    }
}

