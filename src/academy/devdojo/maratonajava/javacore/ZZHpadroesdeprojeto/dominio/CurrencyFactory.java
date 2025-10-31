package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency (Country country) {
        switch (country) {
            case Country.BRAZIL:
                return new Real();
            case Country.USA:
                return new UsDollar();
            default:
                throw new IllegalArgumentException("Error");
        }
    }
}
