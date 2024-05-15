import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ano anoAtual = new Ano(2024, false);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Listar compromissos de um dia");
            System.out.println("3. Listar todos os compromissos");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCompromisso(scanner, anoAtual);
                    break;
                case 2:
                    listarCompromissosDia(scanner, anoAtual);
                    break;
                case 3:
                    listarTodosCompromissos(anoAtual);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    private static void adicionarCompromisso(Scanner scanner, Ano ano) {
        System.out.println("Digite o nome do mês:");
        String nomeMes = scanner.nextLine();

        System.out.println("Digite o dia do mês:");
        int diaMes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da pessoa:");
        String pessoa = scanner.nextLine();

        System.out.println("Digite o local:");
        String local = scanner.nextLine();

        System.out.println("Digite o assunto:");
        String assunto = scanner.nextLine();

        System.out.println("Digite a hora (0-23):");
        int hora = scanner.nextInt();

        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
        ano.excluirCompromisso(compromisso, nomeMes, diaMes);

        System.out.println("Compromisso adicionado com sucesso!");
    }

    private static void listarCompromissosDia(Scanner scanner, Ano ano) {
        System.out.println("Digite o nome do mês:");
        String nomeMes = scanner.nextLine();

        System.out.println("Digite o dia do mês:");
        int diaMes = scanner.nextInt();

        String[] compromissos = ano.listarCompromissosDia(nomeMes, diaMes);
        System.out.println("Compromissos do dia:");
        for (String compromisso : compromissos) {
            System.out.println(compromisso);
        }
    }

    private static void listarTodosCompromissos(Ano ano) {
        String[] compromissos = ano.listarCompromissos();
        System.out.println("Todos os compromissos:");
        for (String compromisso : compromissos) {
            System.out.println(compromisso);
        }
    }
}
