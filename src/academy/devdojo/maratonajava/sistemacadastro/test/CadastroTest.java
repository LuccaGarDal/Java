package academy.devdojo.maratonajava.sistemacadastro.test;

import academy.devdojo.maratonajava.sistemacadastro.dominio.NomePetInvalidoException;
import academy.devdojo.maratonajava.sistemacadastro.dominio.Pet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoPet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoSexo;

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
             BufferedReader br = new BufferedReader(fr)) {
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
                         BufferedReader br = new BufferedReader(fr)) {
                        Pet pet1 = new Pet();
                        Scanner entrada2 = new Scanner(System.in);
                        String linha;
                        String nome;
                        String tipoPet = ".";
                        String tipoSexo = ".";
                        String raca = ".";
                        double peso = 0;
                        double idade = 0;
                        boolean nomeValido = false;

                        //  NOME ----------------------------------------------

                        linha = br.readLine();
                        while (!nomeValido) {
                            try {
                                System.out.println(linha);
                                nome = entrada2.nextLine();
                                pet1.setNome(nome);

                                if (nome.trim().isEmpty()) {
                                    pet1.setNome("NÃO INFORMADO");
                                } else if (!nome.matches("^[A-Za-z]+\\s[A-Za-z]+$")) {
                                    throw new NomePetInvalidoException("É necessário informar sobrenome.");
                                }


                                nomeValido = true;
                            } catch (NomePetInvalidoException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        // TIPO -----------------------------------------------

                        linha = br.readLine();
                        boolean tipoPetValido = false;
                        while (!tipoPetValido) {
                            try {
                                System.out.println(linha);
                                System.out.println("Cachorro ou Gato: ");
                                tipoPet = entrada2.nextLine();

                                if (!(tipoPet.equalsIgnoreCase("cachorro") || tipoPet.equalsIgnoreCase("gato"))) {
                                    throw new IllegalArgumentException("Você inseriu um valor inválido");
                                }

                                tipoPetValido = true;
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        if (tipoPet.equalsIgnoreCase("Cachorro")) {
                            pet1.setTipoPet(TipoPet.CACHORRO);
                        } else {
                            pet1.setTipoPet(TipoPet.GATO);
                        }

                        // SEXO -----------------------------------------------

                        linha = br.readLine();
                        boolean tipoSexoValido = false;
                        while (!tipoSexoValido) {
                            try {
                                System.out.println(linha);
                                System.out.println("Macho ou Femea: ");
                                tipoSexo = entrada2.nextLine();

                                if (!(tipoSexo.equalsIgnoreCase("macho") || tipoSexo.equalsIgnoreCase("femea"))) {
                                    throw new IllegalArgumentException("Você inseriu um valor inválido");
                                }

                                tipoSexoValido = true;
                            } catch (IllegalArgumentException e) {
                                e.getMessage();
                            }
                        }
                        if (tipoSexo.equalsIgnoreCase("macho")) {
                            pet1.setTipoSexo(TipoSexo.MACHO);
                        } else {
                            pet1.setTipoSexo(TipoSexo.FEMEA);
                        }

                        // ENDEREÇO -------------------------------------------

                        String numeroCasa = "";
                        String cidade = "";
                        String rua = "";
                        linha = br.readLine();
                        boolean enderecoValido = false;
                        while (!enderecoValido) {
                            try {
                                System.out.println(linha);
                                System.out.printf("Número da Casa: ");
                                numeroCasa = entrada2.nextLine();
                                System.out.println("Cidade:  ");
                                cidade = entrada2.nextLine();
                                System.out.println("Rua: ");
                                rua = entrada2.nextLine();

                                if (!cidade.matches("([a-zA-Z]+(\\s|$))+")) {
                                    throw new RuntimeException("Cidade Inválida.");
                                }
                                if (!rua.matches("([a-zA-Z]+(\\s|$))+")) {
                                    throw new RuntimeException("Rua Inválida.");
                                }
                                if (numeroCasa.matches("")) {
                                    numeroCasa = "NÃO INFORMADO";
                                } else if (!numeroCasa.matches("[0-9]+")) {
                                    throw new RuntimeException("Resposta Inválida.");
                                }


                                enderecoValido = true;
                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setEndereco(rua.concat(", " + numeroCasa).concat(", " + cidade));

                        // IDADE ---------------------------------------------

                        linha = br.readLine();
                        boolean idadeValida = false;
                        while (!idadeValida) {
                            try {
                                System.out.println(linha);
                                System.out.println("Digite 0 caso tenha menos de 1 ano.");
                                idade = entrada2.nextDouble();

                                if (idade == 0) {
                                    double idadeEmAnos;
                                    System.out.println("Digite a idade em meses aproximados: ");
                                    idade = entrada2.nextDouble();
                                    idadeEmAnos = idade / 12.0;
                                    idadeValida = true;
                                    idade = idadeEmAnos;
                                }
                                if (idade > 20) {
                                    throw new RuntimeException("A Idade é inválida");
                                }

                                idadeValida = true;

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setIdade(idade);

                        // RAÇA ---------------------------------------------

                        linha = br.readLine();
                        boolean pesoValido = false;
                        while (!pesoValido) {
                            try {
                                System.out.println(linha);
                                peso = entrada2.nextDouble();

                                if (peso < 0.5 || peso > 60) {
                                    throw new RuntimeException("Peso Inválido");
                                }
                                pesoValido = true;
                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setPeso(peso);

                        // RAÇA --------------------------------------------

                        linha = br.readLine();
                        boolean racaValida = false;
                        entrada2.nextLine();
                        while (!racaValida) {
                            try {
                                System.out.println(linha);
                                raca = entrada2.nextLine();

                                if (!(raca.matches("([a-zA-Z]+(\\s|$))+"))) {
                                    throw new RuntimeException("Raça Inválida");
                                }
                                racaValida = true;
                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setRaca(raca);               // adicionar NAO INFORMADO nos que faltaram

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
