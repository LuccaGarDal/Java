package academy.devdojo.maratonajava.exercicios;

public class Exercicio19Tabuada {
    public static void main(String[] args) {
        int num = 1;
        while (num < 11) {
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " X " + i + " = " + result);
            }
            num++;
            System.out.println(" ");
        }
    }
}
