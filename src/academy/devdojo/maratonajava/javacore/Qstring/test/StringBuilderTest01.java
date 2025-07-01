package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome.substring(0,3);                         //aqui é apenas mostrando que não é possível modificar a string original
        System.out.println(nome);
        StringBuilder sb = new StringBuilder();
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
