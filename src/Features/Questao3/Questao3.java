package Features.Questao3;

import Features.Questao3.Models.Produto;
import Features.Questao3.Models.Telefone;
import Features.Questao3.Models.TelefoneSemFio;
import Utils.Terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {
    private static final List<Produto> produtos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            Terminal.clearScreen();
            System.out.println("\n=== SISTEMA DE CADASTRO DE PRODUTOS ===");
            System.out.println("1 - Cadastrar Telefone com Fio");
            System.out.println("2 - Cadastrar Telefone Sem Fio");
            System.out.println("3 - Listar Produtos Cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarTelefone();
                    break;
                case 2:
                    cadastrarTelefoneSemFio();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarTelefone() {
        System.out.println("\n=== CADASTRAR TELEFONE COM FIO ===");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Número de Série: ");
        String numeroSerie = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dimensão: ");
        String dimensao = scanner.nextLine();

        Telefone telefone = new Telefone(codigo, numeroSerie, modelo, peso, dimensao);
        produtos.add(telefone);
        System.out.println("Telefone com fio cadastrado com sucesso!");
    }

    private static void cadastrarTelefoneSemFio() {
        System.out.println("\n=== CADASTRAR TELEFONE SEM FIO ===");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Número de Série: ");
        String numeroSerie = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Dimensão: ");
        String dimensao = scanner.nextLine();

        System.out.print("Frequência (MHz): ");
        double frequencia = scanner.nextDouble();
        System.out.print("Quantidade de Canais: ");
        int canais = scanner.nextInt();
        System.out.print("Distância de Operação (m): ");
        double distanciaOperacao = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        TelefoneSemFio telefoneSemFio = new TelefoneSemFio(codigo, numeroSerie, modelo, peso, dimensao, frequencia, canais, distanciaOperacao);
        produtos.add(telefoneSemFio);
        System.out.println("Telefone sem fio cadastrado com sucesso!");
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.");
        } else {
            System.out.println("\n=== LISTA DE PRODUTOS ===");
            for (Produto p : produtos) {
                p.exibirDetalhes();
                System.out.println();
            }
        }
    }
}
