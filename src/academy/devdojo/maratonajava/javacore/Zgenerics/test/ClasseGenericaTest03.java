package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Ferrari"), new Carro("Audi")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Yacht"), new Barco("Canoa")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Alugando durante 1 mês");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Alugando durante 1 mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
