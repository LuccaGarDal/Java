package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch, dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando um como domingo
        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("Não é dia útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
