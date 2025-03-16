package Features.Questao2.Models;

public class Dependente extends Pessoa {
    public Dependente(String nome) {
        super(nome);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("- Dependente: " + nome);
    }
}
