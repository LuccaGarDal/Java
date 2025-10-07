package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Lucca";

    public void print() {
        String sobrenome = "Garcia";

        class LocalClass {
            void printLocal () {
                System.out.println(nome + " " + sobrenome);

            }
        }

        new LocalClass().printLocal();
    }

    static void main() {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }

}
