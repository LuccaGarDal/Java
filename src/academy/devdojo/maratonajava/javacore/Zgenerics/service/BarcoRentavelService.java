package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Yacht"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando barco disponível: ");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco " + barco);
        System.out.println("Barcos disponíveis para alguar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Lista de barcos disponíveis");
        System.out.println(barcosDisponiveis);
    }
}
