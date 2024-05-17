package src.main.java.Cenario09;

import java.util.Scanner;

public class Programa {
    private static Scanner scanner = new Scanner(System.in);
    private static ClientePessoa clientePessoa;
    private static ClienteEmpresa clienteEmpresa;

    public static void main(String[] args) {
        exibirMenu();
    }

    private static void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolucaoClientePessoa();
                    break;
                case 8:
                    devolucaoClienteEmpresa();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    private static void incluirClientePessoa() {
        scanner.nextLine(); 
        System.out.println("\nIncluir Cliente Pessoa:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String uf = scanner.nextLine();
        System.out.print("Crédito: ");
        double credito = scanner.nextDouble();
        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidade, uf));
        clientePessoa = new ClientePessoa(nome, telefone, email, endereco, credito, uf, credito, credito);
        System.out.println("Cliente pessoa incluído com sucesso!");
    }

    private static void incluirClienteEmpresa() {
        scanner.nextLine();
        System.out.println("\nIncluir Cliente Empresa:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("UF: ");
        String uf = scanner.nextLine();
        System.out.print("Crédito: ");
        double credito = scanner.nextDouble();
        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidade, uf));
        clienteEmpresa = new ClienteEmpresa(nome, telefone, email, endereco, credito, uf, uf, 0);
        System.out.println("Cliente empresa incluído com sucesso!");
    }

    private static void mostrarDadosClientePessoa() {
        if (clientePessoa != null) {
            System.out.println("\nDados Cliente Pessoa:");
            System.out.println(clientePessoa);
        } else {
            System.out.println("Cliente pessoa não cadastrado.");
        }
    }

    private static void mostrarDadosClienteEmpresa() {
        if (clienteEmpresa != null) {
            System.out.println("\nDados Cliente Empresa:");
            System.out.println(clienteEmpresa);
        } else {
            System.out.println("Cliente empresa não cadastrado.");
        }
    }

    private static void emprestarParaClientePessoa() {
        if (clientePessoa != null) {
            System.out.print("\nValor para emprestar: ");
            double valor = scanner.nextDouble();
            clientePessoa.emprestar(valor);
            System.out.println("Valor emprestado com sucesso!");
        } else {
            System.out.println("Cliente pessoa não cadastrado.");
        }
    }

    private static void emprestarParaClienteEmpresa() {
        if (clienteEmpresa != null) {
            System.out.print("\nValor para emprestar: ");
            double valor = scanner.nextDouble();
            clienteEmpresa.emprestar(valor);
            System.out.println("Valor emprestado com sucesso!");
        } else {
            System.out.println("Cliente empresa não cadastrado.");
        }
    }

    private static void devolucaoClientePessoa() {
        if (clientePessoa != null) {
            System.out.print("\nValor para devolver: ");
            double valor = scanner.nextDouble();
            double saldo = clientePessoa.devolver(valor);
            System.out.println("Valor devolvido. Saldo atual: " + saldo);
        } else {
            System.out.println("Cliente pessoa não cadastrado.");
        }
    }

    private static void devolucaoClienteEmpresa() {
        if (clienteEmpresa != null) {
            System.out.print("\nValor para devolver: ");
            double valor = scanner.nextDouble();
            double saldo = clienteEmpresa.devolver(valor);
            System.out.println("Valor devolvido. Saldo atual: " + saldo);
        } else {
            System.out.println("Cliente empresa não cadastrado.");
        }
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Programa.scanner = scanner;
    }

    public static ClientePessoa getClientePessoa() {
        return clientePessoa;
    }

    public static void setClientePessoa(ClientePessoa clientePessoa) {
        Programa.clientePessoa = clientePessoa;
    }

    public static ClienteEmpresa getClienteEmpresa() {
        return clienteEmpresa;
    }

    public static void setClienteEmpresa(ClienteEmpresa clienteEmpresa) {
        Programa.clienteEmpresa = clienteEmpresa;
    }
}

