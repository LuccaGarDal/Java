package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro da ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro da IndexOutOfBoundsException ");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro da IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro da ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }

        try {
            talvezLanceExcpetion();
        } catch (SQLException e) {
            System.out.println("Dentro da SQLException");
        } catch (FileNotFoundException e) {
            System.out.println("Dentro da FileNotFoundException");
        }
    }

    private static void talvezLanceExcpetion () throws SQLException, FileNotFoundException {

    }
}