package Features.Questao2;

import Features.Questao2.Models.Funcionario;

import java.util.Scanner;

public class Questao2 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario, matricula);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do dependente " + (i + 1) + ": ");
            String nomeDependente = scanner.nextLine();
            funcionario.adicionarDependente(i, nomeDependente);
        }

        System.out.println("\n=== DADOS DO FUNCIONÁRIO ===");
        funcionario.exibirInformacoes();

        scanner.close();
    }
}
