package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \d = Todos os Dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco ou \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z/A-Z
        // \W = Tudo o que não for incluso no \w
        String regex = "\\d";
        String texto = "hhjghkj2j3hk2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
