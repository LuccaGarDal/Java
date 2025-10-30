package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

// storename:price:discountCode
public class Discount {
    public enum Code {
        NONE(0), SUPER_SAIYAJIN(5), SUPER_SAIYAJIN2(10), SUPER_SAIYAJIN3(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
