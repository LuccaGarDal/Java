package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades [0] = 21;
        idades [1] = 15;
        idades [2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}

// ao criar o new int com 3 espaços, a arrays idades carregará 3 espaços de memória
// nesses 3 espaços, começa no 0, ou seja, será 0, 1 e 2