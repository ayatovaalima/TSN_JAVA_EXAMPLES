package tsn.javase.demo09;

public class Dog { // Класс "Собака"
    final static int max_year = 50; // Константа
    String name; // Имя собаки
    int year; // Количество лет собаки
    static int count = 0; // Статическое поле, колич. созданных объектов собак

    Dog() { // Метод-конструктор по-умолчанию
        name = "Sobaka"; year = 0; count++;
    } 

    Dog(String n, int y) { // Перезагрузка метода конструктора
        year = y; name = n;  count++;
    } 

    void Dog_old() { // Метод класса
        name = "Sobaka_old"; year = 10;
    } 
   
}
