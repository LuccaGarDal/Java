package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Nissan Skyline";
        carro1.modelo = "GTR";
        carro1.ano = 2010;

        carro2.nome = "Audi";
        carro2.modelo = "G3";
        carro2.ano = 2013;

        carro1 = carro2;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("------------");

        System.out.println("Carro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}

//caso seja colocado, carro1 = carro2 ou ao contrario (apos decalarar as variaveis) o carro 1 imprimirá os mesmos atributos do carro2 ou vice versa,