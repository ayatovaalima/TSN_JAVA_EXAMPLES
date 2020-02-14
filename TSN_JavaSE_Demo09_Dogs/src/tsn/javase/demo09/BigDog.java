package tsn.javase.demo09;

public class BigDog extends Dog { // Наследование класса от другого класса
    int weight; // Вес собаки

    BigDog() { // Метод-конструктор по-умолчанию
        name = "BigDog"; year = 5; weight = 4;
    } 

    BigDog(String n, int y, int v) { // Перезагрузка метода конструктора
        super(n, y); // Вызов конструктора суперкласса
        weight = v; // Установка значения у поля
    }

    void Dog_old() { // Полиморфизм метода
        name = "Dog_big_old"; year = 12;
    } 
}
