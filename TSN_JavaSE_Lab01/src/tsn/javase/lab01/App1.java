package tsn.javase.lab01;

import java.util.Scanner;


public class App1 {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Создание простейшей консольной программы на JAVA");
            System.out.print("Введите X(число):");
            double x = scan.nextInt();
            System.out.print("Введите А(число, более нуля):");
            double a = scan.nextInt();
            System.out.print("Введите B(число, более нуля):");
            double b = scan.nextInt();
            double y;
      
            if (x < 8) {
                y = x * Math.pow(a + b, 2);
            } else {
                y = (x / Math.pow(a, 2)) + (x / Math.pow(b, 2));
            }

            System.out.format("Y=%.3f", y); System.out.println();
        } catch (Exception ex) {
            System.out.println("Входные параметры заданы неверно!");
        }

    }
}
