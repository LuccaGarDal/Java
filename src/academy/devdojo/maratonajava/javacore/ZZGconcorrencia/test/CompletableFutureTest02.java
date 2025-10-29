package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest02 {
    static void main(String[] args) {
        StoreService service = new StoreService();
        searchPriceAsyncCompletableFuture(service);

    }

    private static void searchPriceAsyncCompletableFuture (StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = new ArrayList<>(List.of("Store 1", "Store 2", "Store 3", "Store 4"));

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPriceCompletableFutureAsync)
                .toList();

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .toList();

        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));
    }

}
