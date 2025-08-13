package academy.devdojo.maratonajava.sistemacadastro.test;

import academy.devdojo.maratonajava.sistemacadastro.dominio.NomePetInvalidoException;
import academy.devdojo.maratonajava.sistemacadastro.dominio.Pet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoPet;

import java.io.*;
import java.util.Scanner;

public class CadastroTest {
    public static void main(String[] args) {
        File formulario = new File("formulario.txt");
        try (FileWriter fw = new FileWriter(formulario);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("1 - Qual o nome e sobrenome do pet?");
            bw.newLine();
            bw.write("2 - Qual o tipo do pet (Cachorro/Gato)?");
            bw.newLine();
            bw.write("3 - Qual o sexo do animal?");
            bw.newLine();
            bw.write("4 - Qual endereço e bairro que ele foi encontrado?");
            bw.newLine();
            bw.write("5 - Qual a idade aproximada do pet?");
            bw.newLine();
            bw.write("6 - Qual o peso aproximado do pet?");
            bw.newLine();
            bw.write("7 - Qual a raça do pet?");
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(formulario);
        BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner entrada = new Scanner(System.in);
        int opcao = -1;
        while (opcao != 6) {
            System.out.println("\n MENU DE OPCÕES: ");
            System.out.println("1 - Cadastrar um novo pet");
            System.out.println("2 - Alterar os dados do pet cadastrado");
            System.out.println("3 - Deletar um pet cadastrado");
            System.out.println("4 - Listar todos os pets cadastrados");
            System.out.println("5 - Listar pets por algum critério (idade, nome, raça) ");
            System.out.println("6 - Sair");
            System.out.println("Digite o número correspondente a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao > 6 || opcao < 1) {
                System.out.println("Opcão inválidae, digite novamente: ");
                continue;
            }

            switch (opcao) {
                case 1:
                    try (FileReader fr = new FileReader(formulario);
                         BufferedReader br = new BufferedReader(fr)){
                        Pet pet1 = new Pet();
                        Scanner entrada2 = new Scanner(System.in);
                        String linha;
                        String nome;
                        String tipoPet = ".";
                        boolean nomeValido = false;
                        linha = br.readLine();
                        while (!nomeValido) {
                            try {
                                System.out.println(linha);
                                nome = entrada2.nextLine();
                                pet1.setNome(nome);

                                if (!nome.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
                                    throw new NomePetInvalidoException("É necessário informar sobrenome.");
                                }

                                nomeValido = true;
                            } catch (NomePetInvalidoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        linha = br.readLine();
                        boolean tipoValido = false;
                        while (!tipoValido) {
                            try {
                                System.out.println(linha);
                                tipoPet = entrada2.nextLine();

                                if (!(tipoPet.equalsIgnoreCase("cachorro")  || tipoPet.equalsIgnoreCase("gato"))) {
                                    throw new IllegalArgumentException("Você inseriu um valor inválido");
                                }

                                tipoValido = true;
                            } catch (IllegalArgumentException e) {
                                e.getMessage();
                            }
                        }
                        if (tipoPet.equals("Cachorro")) {
                            pet1.setTipoPet(TipoPet.CACHORRO);
                        } else {
                            pet1.setTipoPet(TipoPet.GATO);
                        }
                        System.out.println(pet1.getNome());
                        System.out.println(pet1.getTipoPet().getNome());





                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("Opção Indisponível");
                case 3:
                    System.out.println("Opção Indisponível");
                case 4:
                    System.out.println("Opção Indisponível");
                case 5:
                    System.out.println("Opção Indisponível");
                case 6:
                    System.out.println("Saindo do Menu...");
            }
            break;
        }
    }
}
