package OOP_Java.PLaT_W11.Problem_8_main;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        PolynomialParser parser = new PolynomialParser();

        // Создание полинома с помощью парсера.
        Polynom firstPolynom = parser.parse(" 32x^5 - 5x^2 + 4x + 3");
        System.out.println("Первый многочлен: " + firstPolynom);

        // - 3x^5 - x + 2
        Map<Integer, Integer> members = new HashMap<>();
        members.put(5, -3);
        members.put(1, -1);
        members.put(0, 2);

        // Создание полинома с помощью конструктора и контейнера Map
        Polynom secondPolynom = new Polynom(members);
        System.out.println("Второй многочлен: " + secondPolynom);

        // Сложение
        System.out.println("\n Сложение: "
                + firstPolynom.add(secondPolynom));

        // Вычитание
        System.out.println("Вычитание: "
                + firstPolynom.subtract(secondPolynom));

        // Умножение
        System.out.println("Умножение: "
                + firstPolynom.multiply(secondPolynom));
    }
}
