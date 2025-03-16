package Features.Questao2.Models;

public class Funcionario extends Pessoa {
    private final String matricula;
    private final Dependente[] dependentes;

    public Funcionario(String nome, String matricula) {
        super(nome);
        this.nome = nome;
        this.matricula = matricula;
        this.dependentes = new Dependente[4];
    }

    public void adicionarDependente(int index, String nome) {
        if (index >= 0 && index < 4) {
            dependentes[index] = new Dependente(nome);
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Matrícula: " + matricula);
        super.exibirInformacoes();
        System.out.println("Dependentes:");
        for (Dependente dep : dependentes) {
            if (dep != null) {
                dep.exibirInformacoes();
            }
        }
    }


}
