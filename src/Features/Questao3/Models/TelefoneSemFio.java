package Features.Questao3.Models;

public class TelefoneSemFio extends Produto {
    private final double frequencia;
    private final int canais;
    private final double distanciaOperacao;

    public TelefoneSemFio(int codigo, String numeroSerie, String modelo, double peso, String dimensao,
                          double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numeroSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n=== TELEFONE SEM FIO ===");
        super.exibirDetalhes();
        System.out.println("Frequência: " + frequencia + " MHz");
        System.out.println("Canais: " + canais);
        System.out.println("Distância de Operação: " + distanciaOperacao + " metros");
    }
}
