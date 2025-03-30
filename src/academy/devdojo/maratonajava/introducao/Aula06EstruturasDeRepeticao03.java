package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor, Por exemplo, 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
// mesmo com o IF, o laço de repetição continua rodando, por isso é necessário o break, que quebrará o for, por isso ele não imprimirá mais nada