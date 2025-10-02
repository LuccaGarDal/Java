package academy.devdojo.maratonajava.exercicios.ExercicioHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap03 {
    static void main() {
        Map<String, String> listaTelefonica = new HashMap<>();

        int funcao = 0;
        while (funcao != 5) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Adicionar nome e telefone");
        System.out.println("2 - Buscar nome/telefone");
        System.out.println("3 - Remover contato");
        System.out.println("4 - Listar contatos");
        System.out.println("5 - Sair");
        funcao = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);

            switch (funcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = scan2.nextLine();
                    System.out.println("Digite o telefone: ");
                    String telefone = scan2.nextLine();

                    listaTelefonica.put(nome, telefone);
                    System.out.println("Deseja continuar ou sair?");
                    System.out.println("1 - Continuar");
                    System.out.println("2 - Sair");
                    int escolha2 = scan.nextInt();
                    if (escolha2 == 2) {
                        funcao = 5;
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome para buscar e deletar: ");
                    String nomeBusca = scan2.nextLine();
                    System.out.println("--------Contatos encontrados--------");
                    for (Map.Entry<String, String> entry : listaTelefonica.entrySet()) {
                        if (entry.getKey().toLowerCase().contains(nomeBusca.toLowerCase())) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    System.out.println("Deseja continuar ou sair?");
                    System.out.println("1 - Continuar");
                    System.out.println("2 - Sair");
                    escolha2 = scan.nextInt();
                    if (escolha2 == 2) {
                        funcao = 5;
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do contato que deseja deletar: ");
                    String nomeDeletar = scan2.nextLine();
                    for (Map.Entry<String, String> entry : listaTelefonica.entrySet()) {
                        if (entry.getKey().toLowerCase().contains(nomeDeletar.toLowerCase())) {
                            System.out.println("Deseja deletar " + entry.getKey() + " - " + entry.getValue() + "?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - Não");
                            int decisao = scan2.nextInt();
                            if (decisao == 1) {
                                listaTelefonica.remove(entry.getKey());
                                System.out.println("Contato removido");
                            } else {
                                break;
                            }
                        }
                    }
                    System.out.println("Deseja continuar ou sair?");
                    System.out.println("1 - Continuar");
                    System.out.println("2 - Sair");
                    escolha2 = scan.nextInt();
                    if (escolha2 == 2) {
                        funcao = 5;
                    }
                    break;
                case 4:
                    System.out.println("------------Lista de contatos-------------");
                    for (Map.Entry<String, String> entry : listaTelefonica.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    System.out.println("Deseja continuar ou sair?");
                    System.out.println("1 - Continuar");
                    System.out.println("2 - Sair");
                    escolha2 = scan.nextInt();
                    if (escolha2 == 2) {
                        funcao = 5;
                    }
                    break;


            }
        }
    }
}
