package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'C';
        boolean booleanP = false;

        // boxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'C';
        Boolean booleanW = false;

        // unboxing
        int i = intW;

        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLetterOrDigit('!'));


    }
}
