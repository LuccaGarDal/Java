package academy.devdojo.maratonajava.sistemacadastro.test;

import academy.devdojo.maratonajava.sistemacadastro.dominio.Pet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoPet;
import academy.devdojo.maratonajava.sistemacadastro.dominio.TipoSexo;

import java.io.*;

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

        Pet pet = new Pet("carlinhos", TipoPet.CACHORRO, TipoSexo.MACHO, "Rua do Caralho", 12, 5,"Caramelo");
        pet.imprimir();
    }
}
