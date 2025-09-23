package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Lucca", "123456");
        Turma turma = new Turma("Turma do pagode");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar (Aluno aluno) {
        Path path = Paths.get("aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
          oos.writeObject(aluno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserializar () {
        Path path = Paths.get("aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno1 = (Aluno) ois.readObject();
            System.out.println(aluno1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
