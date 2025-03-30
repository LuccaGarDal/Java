package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora ();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro da CalculadoraTeste04");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);


    }
}

// ao definir variaveis antes do métodos, uma cópia delas é enviada e alterada caso esteja definido no método
// nesse caso, a original nunca é alterada, e sim sua cópia. por isso ao printar ela na tela, ela se manteve