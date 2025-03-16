package Features.Questao3.Models;

public class TelefoneSemFio extends Telefone {
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
    public void exibirTitulo() {
        System.out.println("Telefone Sem Fio");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Frequência: " + frequencia + " MHz");
        System.out.println("Canais: " + canais);
        System.out.println("Distância de Operação: " + distanciaOperacao + " metros");
    }
}
