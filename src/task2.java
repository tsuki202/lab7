public class task2 {
    public static void main(String[] args) {
        // Задані довжини катетів
        double a = 3;
        double b = 4;

        // Обчислення гіпотенузи за теоремою Піфагора
        double c = Math.sqrt(a * a + b * b);

        // Обчислення периметру
        double perimeter = a + b + c;

        // Обчислення площі
        double area = (a * b) / 2;

        // Виведення результатів
        System.out.println("Довжина катета a: " + a);
        System.out.println("Довжина катета b: " + b);
        System.out.println("Довжина гіпотенузи c: " + c);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);
    }
}
