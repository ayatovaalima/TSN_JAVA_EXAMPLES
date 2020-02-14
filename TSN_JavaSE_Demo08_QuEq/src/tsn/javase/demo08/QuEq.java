package tsn.javase.demo08;

// Класс "Квадратное уравнение"
public class QuEq {

    public double a, b, c; // Входные переменные
    private double d; // Дескрименант
    public double x1, x2; // Искомые значения
    public boolean solution; // Флаг наличия решения

    QuEq() { // Конструктор класса
        a = 0; b = 0; c = 0; d = 0; x1 = 0; x2 = 0;
    }

    // Метод класса для расчета
    public boolean Calc(double a, double b, double c) {
        this.a = a;  this.b = b; this.c = c;  solution = false;
        d = (b * b) - 4 * a * c;
        try {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (!(Double.isNaN(x1)) && (!Double.isInfinite(x1)) &&
                    (!(Double.isNaN(x2)) && (!Double.isInfinite(x2)))) {
                solution = true;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
}
