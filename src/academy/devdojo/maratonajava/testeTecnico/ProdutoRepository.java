package academy.devdojo.maratonajava.testeTecnico;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtoList = new ArrayList<>();

    public ProdutoRepository(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public void addProduto (Produto produto) {
        produtoList.add(produto);
        System.out.printf("%s adicionado com sucesso!%n", produto.getName());
    }

    public List<Produto> listAllProdutos () {
        if (produtoList.isEmpty()) {
            System.out.println("A lista está vazia");
            return null;
        }
        System.out.println("Aqui está a lista de produtos disponíveis:");
        return produtoList;
    }

    public List<Produto> searchByName (String name) {
        List<Produto> listByName = new ArrayList<>();
        for (Produto produto : produtoList) {
            if (produto.getName().contains(name)) {
                listByName.add(produto);
            }
        }
        if (listByName.isEmpty()) {
            System.out.println("Não foram encontrados produtos com esse nome");
            return null;
        }
        else {
            System.out.printf("Aqui está a lista de produtos que contém %s", name);
            return listByName;
        }

    }

    public List<Produto> searchById (int id) {
        List<Produto> listById = new ArrayList<>();
        for (Produto produto : produtoList) {
            if (produto.getId() == id) {
                listById.add(produto);
            }
        }
        if (listById.isEmpty()) {
            System.out.printf("Não foi possível achar nenhum produto com o id %d%n", id);
            return null;
        }
        else {
            System.out.printf("Aqui está a lista de produtos com o id %d%n", id);
            return listById;
        }

    }
}
