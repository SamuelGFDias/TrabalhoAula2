package Features.Questao3.Models;

public class Telefone extends Produto {
    public Telefone(int codigo, String numeroSerie, String modelo, double peso, String dimensao) {
        super(codigo, numeroSerie, modelo, peso, dimensao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n=== TELEFONE COM FIO ===");
        super.exibirDetalhes();
    }
}
