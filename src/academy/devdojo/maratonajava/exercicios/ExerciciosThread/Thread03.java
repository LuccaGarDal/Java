package academy.devdojo.maratonajava.exercicios.ExerciciosThread;


public class Thread03 {
    static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(runnable, "ALTA");
        Thread t2 = new Thread(runnable, "MÉDIA");
        Thread t3 = new Thread(runnable, "BAIXA");


        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
