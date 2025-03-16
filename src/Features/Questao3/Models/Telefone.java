    package Features.Questao3.Models;

    public class Telefone extends Produto {
        public Telefone(int codigo, String numeroSerie, String modelo, double peso, String dimensao) {
            super(codigo, numeroSerie, modelo, peso, dimensao);
        }

        @Override
        public void exibirTitulo() {
            System.out.println("Telefone Com Fio");
        }

        @Override
        public void exibirDetalhes() {
            super.exibirDetalhes();
        }
    }
