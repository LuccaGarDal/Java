package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 12;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adult0";
        }
        System.out.println(categoria);
    }
}
// variaveis locais, como a varíavel "categoria" acima, precisam ser inicializadas em algum momento, se não, não compila
// caso a variavel não seja contemplada em algum momento, vc pode atribuir um valor a ela que será sobrescrita caso seja contemplada
// e caso não seja, sera posto o valor que vc atribuiui
// por exemplo, caso vc atribua a variavel categoria = "Nada". Caso ela não se encaixe em nenhum if ou else, será escrito "Nada"
// Caso ela se encaixe, o "nada" será sobrescrito por o que vc definir no if ou else.