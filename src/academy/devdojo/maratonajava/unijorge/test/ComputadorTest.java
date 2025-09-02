package academy.devdojo.maratonajava.unijorge.test;

import academy.devdojo.maratonajava.unijorge.dominio.Computador;

import java.util.Scanner;

public class ComputadorTest {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Computador 1 (Sem parâmetros)
        System.out.println("Informe os dados do computador 1: ");
        System.out.println("Marca:");
        String marca1 = scan.nextLine();
        System.out.println("Placa de vídeo: ");
        String placaDeVideo1 = scan.nextLine();
        System.out.println("Cor: ");
        String cor1 = scan.nextLine();
        System.out.println("Memória: ");
        int memoria1 = scan.nextInt();
        System.out.println("Ano de fabricação: ");
        int anoDeFabricacao1 = scan.nextInt();
        scan.nextLine();
        System.out.print("\n");

        //Computador 2 (Sem parâmetros)
        System.out.println("Informe os dados do computador 2: ");
        System.out.println("Marca:");
        String marca2 = scan.nextLine();
        System.out.println("Placa de vídeo: ");
        String placaDeVideo2 = scan.nextLine();
        System.out.println("Cor: ");
        String cor2 = scan.nextLine();
        System.out.println("Memória: ");
        int memoria2 = scan.nextInt();
        System.out.println("Ano de fabricação: ");
        int anoDeFabricacao2 = scan.nextInt();
        scan.nextLine();

        //Computador 3 (Com parâmetros)
        System.out.println("Informe os dados do computador 3: ");
        System.out.println("Marca:");
        String marca3 = scan.nextLine();
        System.out.println("Placa de vídeo: ");
        String placaDeVideo3 = scan.nextLine();
        System.out.println("Cor: ");
        String cor3 = scan.nextLine();
        System.out.println("Memória: ");
        int memoria3 = scan.nextInt();
        System.out.println("Ano de fabricação: ");
        int anoDeFabricacao3 = scan.nextInt();
        scan.nextLine();

        //Computador 4 (Com parâmetros)
        System.out.println("Informe os dados do computador 4: ");
        System.out.println("Marca:");
        String marca4 = scan.nextLine();
        System.out.println("Placa de vídeo: ");
        String placaDeVideo4 = scan.nextLine();
        System.out.println("Cor: ");
        String cor4 = scan.nextLine();
        System.out.println("Memória: ");
        int memoria4 = scan.nextInt();
        System.out.println("Ano de fabricação: ");
        int anoDeFabricacao4 = scan.nextInt();
        scan.nextLine();


        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador(marca3, placaDeVideo3, cor3, memoria3, anoDeFabricacao3);
        Computador computador4 = new Computador(marca4, placaDeVideo4, cor4, memoria4, anoDeFabricacao4);

        computador1.setMarca(marca1);
        computador1.setPlacaDeVideo(placaDeVideo1);
        computador1.setCor(cor1);
        computador1.setMemoria(memoria1);
        computador1.setAnoFabricacao(anoDeFabricacao1);

        computador2.setMarca(marca2);
        computador2.setPlacaDeVideo(placaDeVideo2);
        computador2.setCor(cor2);
        computador2.setMemoria(memoria2);
        computador2.setAnoFabricacao(anoDeFabricacao2);

        System.out.println("Especificações do Computador 1");
        computador1.imprimir();
        System.out.println("Especificações do Computador 2");
        computador2.imprimir();
        System.out.println("Especificações do Computador 3");
        computador3.imprimir();
        System.out.println("Especificações do Computador 4");
        computador4.imprimir();

    }
}
