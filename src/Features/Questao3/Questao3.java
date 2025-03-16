package Features.Questao3;

import Features.Questao3.Models.Produto;
import Features.Questao3.Models.Telefone;
import Features.Questao3.Models.TelefoneSemFio;

import java.util.ArrayList;
import java.util.List;

public class Questao3 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Telefone telefoneComFio = new Telefone(1001, "SN12345", "Modelo X", 0.5, "15x10x5 cm");
        produtos.add(telefoneComFio);

        TelefoneSemFio telefoneSemFio = new TelefoneSemFio(2001, "SN67890", "Modelo Y", 0.4, "18x12x6 cm", 2.4, 10, 50);
        produtos.add(telefoneSemFio);

        for (Produto p : produtos) {
            p.exibirDetalhes();
            System.out.println();
        }
    }
}
