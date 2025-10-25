package academy.devdojo.maratonajava.testeTecnico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Produto> list = new ArrayList<>(List.of(
                new Produto("Escova", 1, 15.86, 2),
                new Produto("Pente", 2, 11.81, 1),
                new Produto("Copo", 3, 5.99, 3),
                new Produto("Celular", 4, 699.00, 1),
                new Produto("Camisa", 5, 59.80, 5),
                new Produto("Camera", 6, 350.00, 1),
                new Produto("Notebook", 7, 1200.00, 1),
                new Produto("Farinha", 8, 9.99, 2)
        ));

        ProdutoRepository produtoRepository = new ProdutoRepository(list);
        produtoRepository.addProduto(new Produto("Pomada", 9, 39.90, 1));
        System.out.println(produtoRepository.listAllProdutos());
        System.out.println(produtoRepository.searchByName("Escova"));
        System.out.println(produtoRepository.searchById(1));
    }
}
