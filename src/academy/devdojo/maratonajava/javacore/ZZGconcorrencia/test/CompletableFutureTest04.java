package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreServiceWithDiscount;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest04 {
    static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
//        searchPricesWithDiscount(service);
        searchPricesWithDiscountAssync(service);
    }

    private static void searchPricesWithDiscount (StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = new ArrayList<>(List.of("Store 1", "Store 2", "Store 3", "Store 4"));
//        stores.forEach( s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));
    }

    private static void searchPricesWithDiscountAssync (StoreServiceWithDiscount service) {
        long start = System.currentTimeMillis();
        List<String> stores = new ArrayList<>(List.of("Store 1", "Store 2", "Store 3", "Store 4"));
        List<CompletableFuture<String>> list = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(s -> s.thenApply(Quote::newQuote))
                .map(s -> s.thenCompose(q -> CompletableFuture.supplyAsync(() -> service.applyDiscount(q))))
                .toList();

        list.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end-start));
    }
}
