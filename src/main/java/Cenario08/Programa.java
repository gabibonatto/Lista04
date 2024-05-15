package src.main.java.Cenario08;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir um contato pessoal");
            System.out.println("2. Incluir um contato comercial");
            System.out.println("3. Excluir um contato pelo código");
            System.out.println("4. Consultar um contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código: ");
                    int codigoPessoal = scanner.nextInt();
                    System.out.print("Digite o nome: ");
                    String nomePessoal = scanner.next();
                    System.out.print("Digite o telefone: ");
                    String telefonePessoal = scanner.next();
                    System.out.print("Digite o aniversário: ");
                    String aniversario = scanner.next();
                    controller.adicionarContatoPessoal(codigoPessoal, nomePessoal, telefonePessoal, aniversario);
                    break;
                case 2:
                    System.out.print("Digite o código: ");
                    int codigoComercial = scanner.nextInt();
                    System.out.print("Digite o nome: ");
                    String nomeComercial = scanner.next();
                    System.out.print("Digite o telefone: ");
                    String telefoneComercial = scanner.next();
                    System.out.print("Digite o CNPJ: ");
                    String cnpj = scanner.next();
                    controller.adicionarContatoComercial(codigoComercial, nomeComercial, telefoneComercial, cnpj);
                    break;
                case 3:
                    System.out.print("Digite o código do contato a ser excluído: ");
                    int codigoExclusao = scanner.nextInt();
                    controller.excluirContato(codigoExclusao);
                    break;
                case 4:
                    System.out.print("Digite o código do contato a ser consultado: ");
                    int codigoConsulta = scanner.nextInt();
                    Contato contato = controller.consultarContato(codigoConsulta);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato.toString());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Lista de contatos:");
                    System.out.println(controller.listarContatos());
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}