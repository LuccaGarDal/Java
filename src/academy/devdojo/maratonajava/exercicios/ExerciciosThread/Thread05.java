package academy.devdojo.maratonajava.exercicios.ExerciciosThread;

class Contador {
    private int valor;

    public int getValor() {
        return valor;
    }

    synchronized void incrementar () {
        valor++;
    }
}

public class Thread05 {
    static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        
        Runnable tarefa = () -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        };

        Thread[] threads = new Thread[5];
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(tarefa);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        long fim = System.currentTimeMillis();
        long duracao = fim - start;
        System.out.println(duracao);
        System.out.println("Fim do progrmama! O resultado é " + contador.getValor());


    }
}
