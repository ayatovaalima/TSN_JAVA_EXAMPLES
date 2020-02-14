package tsn.javase.demo09;

public class MyApp {

    public static void main(String[] args) {
        // Работа с объектами и классами
        BigDog s = new BigDog(); // СОЗДАНИЕ ОБЪЕКТА КЛАССА "BigDog"
        BigDog s2 = new BigDog("TSN", 10, 9); // СОЗДАНИЕ ОБЪЕКТА КЛАССА "BigDog"
        s.Dog_old();
        System.out.println(s.name);
        System.out.println(s.year);
        System.out.println(s.weight);
        System.out.println("Создано собак: " + s.count);
    }
}
