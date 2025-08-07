package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Path: " + file.getPath());
            System.out.println("Path Absolute: " + file.getAbsolutePath());
            System.out.println("IsDirectory: " + file.isDirectory());
            System.out.println("IsHidden: " + file.isHidden());
            System.out.println("IsFile: " + file.isFile());
            System.out.println("LastModified: " + new Date(file.lastModified()));
            System.out.println("Created: " + isCreated);
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
