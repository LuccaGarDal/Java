package academy.devdojo.maratonajava.exercicios.ExerciciosThread;

class ThreadEx extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Olá, sou lucca!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread02 {
    static void main(String[] args) {

        ThreadEx threadEx = new ThreadEx();

        threadEx.start();

    }
}
