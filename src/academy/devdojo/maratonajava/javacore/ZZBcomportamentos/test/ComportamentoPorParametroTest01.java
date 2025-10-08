package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> listCar = List.of(new Car("green", 2015), new Car("red", 2019), new Car("blue", 2021));

    private static List<Car> filterByColor(List<Car> car, String color) {
        List<Car> carsColors = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equalsIgnoreCase(color)) {
                carsColors.add(car1);
            }

        }
        return carsColors;

    }

    private static List<Car> filterGreen (List<Car> car) {
        List<Car> carsColors = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equalsIgnoreCase("green")) {
                carsColors.add(car1);
            }

        }
        return carsColors;

    }

    private static List<Car> filterRed (List<Car> car) {
        List<Car> carsColors = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getColor().equalsIgnoreCase("red")) {
                carsColors.add(car1);
            }

        }
        return carsColors;

    }

    private static List<Car> filterByYear (List<Car> car, int year) {
        List<Car> carsYears = new ArrayList<>();
        for (Car car1 : car) {
            if (car1.getYear() >= year) {
                carsYears.add(car1);
            }

        }
        return carsYears;

    }

    static void main() {
        System.out.println(filterGreen(listCar));
        System.out.println(filterRed(listCar));
        System.out.println(filterByColor(listCar, "green"));
        System.out.println(filterByColor(listCar, "red"));
        System.out.println(filterByColor(listCar, "blue"));
        System.out.println(filterByYear(listCar, 2019));
        System.out.println(filterByYear(listCar, 2020));
    }
}
