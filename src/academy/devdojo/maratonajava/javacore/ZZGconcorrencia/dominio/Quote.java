package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

// storename:price:discountCode
public class Quote {
    private String storeName;
    private double price;
    private Discount.Code discountCode;

    private Quote(String storeName, double price, Discount.Code discountCode) {
        this.storeName = storeName;
        this.price = price;
        this.discountCode = discountCode;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "storeName='" + storeName + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStoreName() {
        return storeName;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }

    public static Quote newQuote (String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
    }
}
