package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try (FileWriter fw = new FileWriter(file, true)
        ;BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Salve");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
