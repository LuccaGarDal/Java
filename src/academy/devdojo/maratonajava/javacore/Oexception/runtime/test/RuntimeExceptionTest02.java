package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(4, 2);

        System.out.println("Código Finalizado");

    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new  IllegalArgumentException ("Argumento inválido, o número não pode ser zero");

        }
        return a/b;

    }
}
