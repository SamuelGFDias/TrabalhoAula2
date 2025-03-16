package Features.Questao3.Models;

public class Produto {
    protected int codigo;
    protected String numeroSerie;
    protected String modelo;
    protected double peso;
    protected String dimensao;

    public Produto(int codigo, String numeroSerie, String modelo, double peso, String dimensao) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    public void exibirTitulo() {
        System.out.println("Produto");
    }

    public void exibirDetalhes() {
        exibirTitulo();
        System.out.println("Código: " + codigo);
        System.out.println("Número de Série: " + numeroSerie);
        System.out.println("Modelo: " + modelo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dimensão: " + dimensao);
    }
}
