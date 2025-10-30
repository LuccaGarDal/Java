package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest03 {
    static void main(String[] args) {
        StoreServiceDeprecated service = new StoreServiceDeprecated();
        searchPriceAsyncCompletableFuture(service);

    }

    private static void searchPriceAsyncCompletableFuture (StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10, r ->  {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        } );
        List<String> stores = new ArrayList<>(List.of("Store 1", "Store 2", "Store 3", "Store 4"));

        List<CompletableFuture<Double>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s)))
                .toList();

        List<Double> list1 = list.stream()
                .map(CompletableFuture::join)
                .toList();

        System.out.println(list1);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));
    }

}
