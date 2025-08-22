package academy.devdojo.maratonajava.sistemacadastro.test;

import academy.devdojo.maratonajava.sistemacadastro.dominio.NomePetInvalidoException;
import academy.devdojo.maratonajava.sistemacadastro.dominio.Pet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoPet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoSexo;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CadastroTest {
    private static final String NAO_INFORMADO = "NÃO INFORMADO";

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
                        Double idade = 0.0;
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
                                String entradaIdade = entrada2.nextLine();
                                idade = 0.0;

                                if (entradaIdade.isEmpty()) {
                                    idade = -1.0;
                                    idadeValida = true;

                                } else {
                                    double idadeNum = Double.parseDouble(entradaIdade);
                                    if (idadeNum == 0) {
                                        double idadeEmAnos;
                                        System.out.println("Digite a idade em meses aproximados: ");
                                        idadeNum = entrada2.nextDouble();
                                        entrada2.nextLine();
                                        idadeEmAnos = idadeNum / 12.0;
                                        idade = idadeEmAnos;
                                        idadeValida = true;
                                    } else {
                                        idade = idadeNum;
                                    }
                                    if (idadeNum > 20) {
                                        throw new RuntimeException("A Idade é inválida");
                                    }

                                }

                                idadeValida = true;

                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setIdade(idade);

                        // PESO ---------------------------------------------

                        linha = br.readLine();
                        boolean pesoValido = false;
                        while (!pesoValido) {
                            try {
                                System.out.println(linha);
                                String entradaPeso = entrada2.nextLine();
                                peso = 0.0;

                                if (entradaPeso.isEmpty()) {
                                    peso = -1.0;
                                    pesoValido = true;
                                } else {
                                    double pesoNum = Double.parseDouble(entradaPeso);
                                    if (pesoNum < 0.5 || pesoNum > 60) {
                                        throw new RuntimeException("Peso Inválido");
                                    } else {
                                        peso = pesoNum;
                                    }
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
                        while (!racaValida) {
                            try {
                                System.out.println(linha);
                                raca = entrada2.nextLine();

                                if (raca.trim().isEmpty()) {
                                    raca = NAO_INFORMADO;
                                } else if (!(raca.matches("([a-zA-Z]+(\\s|$))+"))) {
                                        throw new RuntimeException("Raça Inválida");
                                }

                                racaValida = true;
                            } catch (RuntimeException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        pet1.setRaca(raca);

                        // Definindo Tempo

                        LocalDateTime timeNow = LocalDateTime.now();
                        DateTimeFormatter foramtter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
                        String horaFormatada = timeNow.format(foramtter);


                        // Escrevendo respostas no arquivo

                        //C:\Users\Jefersonm\Documents\JAVA\maratona-java\src\academy\devdojo\maratonajava\sistemacadastro\petsCadastrados

                        File petsCadastrados = new File("petsCadastrados");
                        petsCadastrados.mkdir();
                        String nomeFormatado = pet1.getNome().toUpperCase().replace(" ", "");
                        File formularioRespostas = new File(petsCadastrados, horaFormatada + "-" + nomeFormatado + ".txt");
                        try (FileWriter fw1 = new FileWriter(formularioRespostas);
                             BufferedWriter bw1 = new BufferedWriter(fw1)) {
                            bw1.write(pet1.getNome());
                            bw1.newLine();
                            bw1.write(pet1.getTipoPet().getNome());
                            bw1.newLine();
                            bw1.write(pet1.getTipoSexo().getNome());
                            bw1.newLine();
                            bw1.write(pet1.getEndereco());
                            bw1.newLine();
                            if (pet1.getIdade() == -1.0) {
                                bw1.write(NAO_INFORMADO);
                            } else {
                                bw1.write(String.valueOf(pet1.getIdade()) + " anos");
                            }
                            bw1.newLine();
                            if (pet1.getPeso() == -1.0) {
                                bw1.write(NAO_INFORMADO);
                            } else {
                                bw1.write(String.valueOf(pet1.getPeso()) + " KG");
                            }
                            bw1.newLine();
                            bw1.write(pet1.getRaca());
                        }

                        System.out.println("Pet cadastrado com sucesso!");


                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    Scanner pesquisar = new Scanner(System.in);
                    int criterioTipoPet;
                    int opcaoPesquisa;
                    String pesquisaNome = "";
                    System.out.println("Qual o tipo do pet que você está procurando? ");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Gato");
                    criterioTipoPet = pesquisar.nextInt();
                    System.out.println("Qual critério deseja usar para char seu pet?");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Sexo");
                    System.out.println("3 - Endereço");
                    System.out.println("4 - Idade");
                    System.out.println("5 - Peso");
                    System.out.println("6 - Raça");
                    System.out.println("7 - Utilizar dois critérios");
                    opcaoPesquisa = pesquisar.nextInt();
                    pesquisar.nextLine();

                    if (criterioTipoPet == 1) {
                        switch (opcaoPesquisa) {
                            case 1:
                                System.out.println("Digite o nome: ");
                                pesquisaNome = pesquisar.nextLine();
                                try (FileReader fr = new FileReader("C:\\Users\\Jefersonm\\Documents\\JAVA\\maratona-java\\petsCadastrados\\20250821T1526-LUCCAGARCIA.txt");
                                     BufferedReader br = new BufferedReader(fr)) {
                                    String linha;
                                    String primeiraLinha = br.readLine();
                                    if (primeiraLinha.matches(pesquisaNome)) {
                                        System.out.print(primeiraLinha + " - ");
                                        while ((linha = br.readLine()) != null) {
                                            System.out.print(linha + " - ");
                                        }
                                    }


                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }


                        }
                    }
                    break;
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
