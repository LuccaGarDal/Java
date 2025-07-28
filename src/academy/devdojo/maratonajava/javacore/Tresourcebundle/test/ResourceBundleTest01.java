package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        Locale local = new Locale("pt", "br");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", local);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.morning"));
    }
}
