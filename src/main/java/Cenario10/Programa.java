package src.main.java.Cenario10;

import java.util.Scanner;

public class Programa {

    private static final SeguroController seguroController = new SeguroController();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private static void incluirSeguro() {
        System.out.println("\nInclusão de Seguro:");
        System.out.print("Número da apólice: ");
        String apolice = scanner.nextLine();
        Seguro seguroExistente = seguroController.localizarSeguro(apolice);
        if (seguroExistente != null) {
            System.out.println("A apólice já existe no sistema.");
            return;
        }

        System.out.println("Seguro incluído com sucesso.");
    }

    private static void localizarSeguro() {
        System.out.println("\nLocalização de Seguro:");
        System.out.print("Número da apólice: ");
        String apolice = scanner.nextLine();
        Seguro seguro = seguroController.localizarSeguro(apolice);
        if (seguro != null) {
            System.out.println("Seguro encontrado:\n" + seguro.getDados());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private static void excluirSeguro() {
        System.out.println("\nExclusão de Seguro:");
        System.out.print("Número da apólice: ");
        String apolice = scanner.nextLine();
        boolean excluido = seguroController.excluirSeguro(apolice);
        if (excluido) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private static void excluirTodosSeguros() {
        System.out.println("\nExclusão de Todos os Seguros:");
        System.out.print("Tem certeza que deseja excluir todos os seguros? (S/N): ");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("S")) {
            seguroController.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private static void listarTodosSeguros() {
        System.out.println("\nListagem de Todos os Seguros:");
        for (Seguro seguro : seguroController.listarTodosSeguros()) {
            System.out.println(seguro.getDados());
        }
    }

    private static void verQuantidadeSeguros() {
        System.out.println("\nQuantidade de Seguros:");
        int quantidade = seguroController.quantidadeSeguros();
        System.out.println("Total de seguros cadastrados: " + quantidade);
    }
}
