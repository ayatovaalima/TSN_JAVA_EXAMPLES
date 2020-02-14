package tsn.javase.demo08;

import java.util.Scanner;

public class MyApp {


    public static void main(String[] args) {
        // Вычисление квадратного уравнения
        double a, b, c;
        QuEq ur = new QuEq(); // Создаем класс для решения уравнения
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения");

        System.out.print("Введите a=");  a = sc.nextDouble();
        System.out.print("Введите b=");  b = sc.nextDouble();
        System.out.print("Введите c=");  c = sc.nextDouble();

        if (ur.Calc(a, b, c) == true) {
            System.out.format("x1=%.3f%nx2= %.3f%n", ur.x1, ur.x2);
        } else {
            System.out.println("Нет решения!");
        }
        try {
        } catch (Exception e) {
        }
    }
}
