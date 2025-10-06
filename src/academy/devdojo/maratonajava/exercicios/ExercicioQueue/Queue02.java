package academy.devdojo.maratonajava.exercicios.ExercicioQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {
    static void main(String[] args) {
        Queue<String> filaDocumentos = new LinkedList<>();
        filaDocumentos.add("Relatório.pdf");
        filaDocumentos.add("Documento.docx");
        filaDocumentos.add("Ficha.png");


        while (!filaDocumentos.isEmpty()) {
            System.out.println("Imprimindo " + filaDocumentos.poll());
        }

        System.out.println("Todos os documentos foram impressos");
    }
}
