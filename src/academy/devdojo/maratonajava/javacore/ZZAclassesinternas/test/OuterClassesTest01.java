package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import javax.xml.namespace.QName;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAtribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    static void main() {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAtribute();

        Inner inner1 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAtribute();
    }
}
