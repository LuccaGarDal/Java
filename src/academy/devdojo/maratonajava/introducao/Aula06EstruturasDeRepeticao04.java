package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    // condição valorParcel >=10000
    public static void main(String[] args) {
        double valorDoCarro = 40000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorDaParcela = valorDoCarro/parcela;
            if(valorDaParcela >= 1000){
                System.out.println("Você pode pagar a quantia de "+valorDoCarro+" em "+parcela+" parcelas de "+valorDaParcela+".");
            }else{
                break;
            }
            System.out.println(parcela);

        }
    }
}
// outra opção seria a condição IF ser que caso o valor da parcel fosse menor que 1000, ele daria um break, economizando