package Features.Questao1.Models;

public class Operacoes {

    public final int firstNum;
    public final double secondNum;

    public Operacoes(int firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public void exibirValor(int primeiro) {
        System.out.println("Valor do primeiro: " + primeiro);
    }

    public void exibirValor(int primeiro, double segundo) {
        System.out.println("Valor do primeiro: " + primeiro + ", Valor do segundo: " + String.format("%.2f", segundo));
    }

    public void exibirValor(double segundo) {
        System.out.println("Valor do segundo: " + String.format("%.2f", segundo));
    }

    public void exibirValorMultiplicado(int primeiro, int fator) {
        System.out.println("Valor do primeiro vezes " + fator + ": " + (primeiro * fator));
    }

    public void exibirValorMultiplicado(double segundo, int fator) {
        System.out.println("Valor do segundo vezes " + fator + ": " + String.format("%.2f", segundo * fator));
    }
}
