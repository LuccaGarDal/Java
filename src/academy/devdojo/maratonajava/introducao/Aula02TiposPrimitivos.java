package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;       //Armazena números inteiros de -2.147.483.648 a 2.147.483.647. É o tipo mais comum para operações numéricas.
        long numeroGrande = (long) 155.23;    //Armazena números inteiros muito grandes. Usado quando int não é suficiente, como em cálculos financeiros.
        double salarioDouble = 2000;          //Armazena números de ponto flutuante com precisão dupla. Preferido para cálculos mais precisos.
        float salarioFloat = 2500.0F;         //Armazena números de ponto flutuante com precisão simples. Utilizado em gráficos e cálculos científicos.
        byte idadeByte = 10;                  //Armazena números inteiros de -128 a 127. Usado quando há necessidade de economizar memória, como em grandes arrays.
        short idadeShort = 10;                //Armazena números inteiros de -32.768 a 32.767. Pode ser usado para economia de memória em comparação com int.
        boolean verdadeiro = true;            //Pode armazenar apenas true ou false. Utilizado para controle de fluxo e lógica condicional.
        boolean falso = false;
        char caractere = '\u0041';            //Armazena um único caractere Unicode. Usado para representar letras, símbolos e caracteres especiais.
        String nome = "Goku";

        System.out.println("a idade é "+idade+" anos.");
        System.out.println(verdadeiro);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é "+nome);
    }
}
