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
                    cadastrarTelefone(true);
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
        cadastrarTelefone(false);
    }

    private static void cadastrarTelefone(boolean isSemFio) {
        System.out.println("\n=== CADASTRAR " + (isSemFio ? "TELEFONE SEM FIO" : "TELEFONE COM FIO") + " ===");

        int codigo = lerInteiro("Código: ");
        String numeroSerie = lerTexto("Número de Série: ");
        String modelo = lerTexto("Modelo: ");
        double peso = lerDouble("Peso (kg): ");
        String dimensao = lerTexto("Dimensão: ");

        if (isSemFio) {
            double frequencia = lerDouble("Frequência (MHz): ");
            int canais = lerInteiro("Quantidade de Canais: ");
            double distanciaOperacao = lerDouble("Distância de Operação (m): ");

            produtos.add(new TelefoneSemFio(codigo, numeroSerie, modelo, peso, dimensao, frequencia, canais, distanciaOperacao));
        } else {
            produtos.add(new Telefone(codigo, numeroSerie, modelo, peso, dimensao));
        }

        System.out.println((isSemFio ? "Telefone sem fio" : "Telefone com fio") + " cadastrado com sucesso!");
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

    private static int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
