package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String nome = "Lucca";

    static class Nested {
        private String sobrenome = "Garcia";

        void print () {
            System.out.println(new OuterClassesTest03().nome + " " + sobrenome);
        }
    }

    static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
