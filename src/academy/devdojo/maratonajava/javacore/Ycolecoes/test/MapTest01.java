package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("vc", "você");
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc2", "você");
        // se exisitirem duas chaves iguais, ele sobreescreve o valor considerando o último colocado

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("---------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("-----------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
