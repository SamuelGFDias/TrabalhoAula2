package Features.Questao2.Models;

public class Pessoa {
    public String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}
