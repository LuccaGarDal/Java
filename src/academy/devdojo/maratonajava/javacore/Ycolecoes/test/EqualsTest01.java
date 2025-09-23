package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main() {
        Smartphone s1 = new Smartphone("12345", "iPhone");
        Smartphone s2 = new Smartphone("12345", "iPhone");
        System.out.println(s1.equals(s2));
    }

}
