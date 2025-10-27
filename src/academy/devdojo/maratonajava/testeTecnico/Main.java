package academy.devdojo.maratonajava.testeTecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        ProdutoRepository produtoRepository = new ProdutoRepository(list);

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {
        System.out.println("Selecione uma opção do menu:");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Listar todos os produtos");
        System.out.println("3 - Buscar produtos por nome");
        System.out.println("4 - Atualizar quantidade de um produto");
        System.out.println("5 - Deletar produto");
        System.out.println("6 - Sair");
        opcao = scanner.nextInt();
        scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os dados do produto para cadastrar:");
                    int id = list.size() + 1;
                    System.out.println("Digite o nome: ");
                    String name = scanner.nextLine();
                    System.out.println("Digite o valor: ");
                    double price = scanner.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    int qnt = scanner.nextInt();
                    produtoRepository.addProduto(new Produto(name, id, price, qnt));
                    System.out.println("1 - Voltar para o menu");
                    System.out.println("2 - Sair");
                    int op = scanner.nextInt();
                    if (op == 1) {
                        break;
                    } else {
                        opcao = 6;
                    }
                case 2:
                    produtoRepository.listAllProdutos().forEach(System.out::println);
                    System.out.println("1 - Voltar para o menu");
                    System.out.println("2 - Sair");
                    op = scanner.nextInt();
                    if (op == 1) {
                        break;
                    } else {
                        opcao = 6;
                    }
                case 3:
                    System.out.println("Digite o nome do produto: ");
                    String searchName = scanner.nextLine();
                    System.out.println(produtoRepository.searchByName(searchName));
                    System.out.println("1 - Voltar para o menu");
                    System.out.println("2 - Sair");
                    op = scanner.nextInt();
                    if (op == 1) {
                        break;
                    } else {
                        opcao = 6;
                    }
                case 4:
                    System.out.println("Digite o ID do produto: ");
                    int ids = scanner.nextInt();
                    System.out.println("Digite a quantidade atualizada: ");
                    int qn = scanner.nextInt();
                    produtoRepository.updateQuantity(ids, qn);
                    System.out.println("1 - Voltar para o menu");
                    System.out.println("2 - Sair");
                    op = scanner.nextInt();
                    if (op == 1) {
                        break;
                    } else {
                        opcao = 6;
                    }
                case 5:
                    System.out.println("Digite o ID do produto que deseja deletar: ");
                    int idDeletar = scanner.nextInt();
                    produtoRepository.deleteProduto(idDeletar);
                    System.out.println("1 - Voltar para o menu");
                    System.out.println("2 - Sair");
                    op = scanner.nextInt();
                    if (op == 1) {
                        break;
                    } else {
                        opcao = 6;
                    }
            }
        }
    }
}
