package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20.5F);
    }
}

// os parametros são estabelecidos na classe dominio e são quantificados e definidos no test
// os parametros funcionam como um contrato, se houver 3 parametros, voce precisar fornecer tres definições