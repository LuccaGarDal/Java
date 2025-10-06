package academy.devdojo.maratonajava.exercicios.ExercicioQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Lucca");
        fila.add("Garcia");
        fila.add("Josué");
        fila.add("Iann");

        while (!fila.isEmpty()) {
            String atendido = fila.poll();
            System.out.println("Atendendo: " + atendido);
            System.out.println(fila);
        }

        System.out.println("Todos os clientes foram atendidos");
    }
}
