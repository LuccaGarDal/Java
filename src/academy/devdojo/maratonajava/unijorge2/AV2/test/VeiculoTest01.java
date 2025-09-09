package academy.devdojo.maratonajava.unijorge2.AV2.test;

import academy.devdojo.maratonajava.unijorge2.AV2.dominio.Aviao;
import academy.devdojo.maratonajava.unijorge2.AV2.dominio.Navio;
import academy.devdojo.maratonajava.unijorge2.AV2.dominio.Veiculo;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Veiculo [] vetVeiculos = new Veiculo[20];
        for (int i = 0; i < 10; i++) {
            System.out.println("---Cadastro do Avião---");
            vetVeiculos[i] = new Aviao();
            vetVeiculos[i].entrada();
        }
        for (int i = 10; i < 20; i++) {
            System.out.println("---Cadastro do Navio---");
            vetVeiculos[i] = new Navio();
            vetVeiculos[i].entrada();
        }
        System.out.println("\n---Lista de Veículos---");
        for (Veiculo v : vetVeiculos) {
            v.imprimir();
            System.out.println("-----------------");
        }

    }
}
