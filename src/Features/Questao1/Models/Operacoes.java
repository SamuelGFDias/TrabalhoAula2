package Features.Questao1.Models;

public class Operacoes {

    public final int firstNum;
    public final double secondNum;

    public Operacoes(int firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }


    @Override
    public String toString() {
        return "Valor do primeiro: " + firstNum +
               "\nValor do primeiro: " + firstNum + ", Valor do segundo: " + secondNum +
               "\nValor do segundo: " + secondNum +
               "\nValor do primeiro vezes três: " + firstNum * 3 +
               "\nValor do segundo vezes dois: " + firstNum * 2;
    }
}
