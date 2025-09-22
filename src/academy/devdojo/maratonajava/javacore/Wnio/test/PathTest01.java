package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main() {
        Path p1 = Paths.get("C:\\Users\\Lucca\\IdeaProjects\\Java\\formulario.txt");
        Path p2 = Paths.get("C:\\Users\\Lucca\\IdeaProjects\\Java", "formulario.txt");
        Path p3 = Paths.get("C:", "Users", "Lucca", "IdeaProjects", "Java", "formulario.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());

    }
}
