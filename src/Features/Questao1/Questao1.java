package Features.Questao1;

import Features.Questao1.Models.Operacoes;

import java.util.Scanner;

public class Questao1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int primeiroNumero = pedirNumero("Informe um valor inteiro", Integer.class);
        double segundoNumero = pedirNumero("Informe um valor real", Double.class);

        final Operacoes operacoes = new Operacoes(primeiroNumero, segundoNumero);

        operacoes.exibirValor(primeiroNumero);
        operacoes.exibirValor(primeiroNumero, segundoNumero);
        operacoes.exibirValor(segundoNumero);
        operacoes.exibirValorMultiplicado(primeiroNumero, 3);
        operacoes.exibirValorMultiplicado(segundoNumero, 2);

        scanner.close();
    }

    public static <T extends Number> T pedirNumero(String mensagem, Class<T> tipo) {
        System.out.print(mensagem + ": ");

        if (tipo == Integer.class) {
            return tipo.cast(scanner.nextInt());
        } else if (tipo == Double.class) {
            return tipo.cast(scanner.nextDouble());
        } else if (tipo == Float.class) {
            return tipo.cast(scanner.nextFloat());
        } else {
            throw new IllegalArgumentException("Tipo não suportado");
        }
    }

}

