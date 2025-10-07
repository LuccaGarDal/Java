package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.ClasseGenerica.Caixa;

public class CaixaTest01 {
    static void main() {
        String texto = "João";
        int numero = 1;
        double number = 2;

        Caixa<String> caixaString = new Caixa<>(texto);
        System.out.println(caixaString);

        System.out.println("--------------");
        Caixa<Integer> integerCaixa = new Caixa<>(numero);
        System.out.println(integerCaixa);

        System.out.println("------------");
        Caixa<Double> doubleCaixa = new Caixa<>(number);
        System.out.println(doubleCaixa);
    }
}
