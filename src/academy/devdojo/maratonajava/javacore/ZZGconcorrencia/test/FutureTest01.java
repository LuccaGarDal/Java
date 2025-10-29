package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 4.350;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(doSomething());
        Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        System.out.println("Dolar: " + dollarResponse);
        executorService.shutdown();
    }
    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum+= i;
        }
        return sum;
    }
}
