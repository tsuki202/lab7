import java.util.Random;
public class task3 {
    public static void main(String[] args) {
        // Генеруємо випадкове число
        Random random = new Random();
        int randomNumber = random.nextInt(101); // Генеруємо число від 0 до 100

        // Виводимо згенероване число
        System.out.println("Згенероване випадкове число: " + randomNumber);

        // Визначаємо кількість цифр у числі
        int digitCount = String.valueOf(randomNumber).length();

        // Виводимо кількість цифр
        System.out.println("Кількість цифр у числі: " + digitCount);
    }
}
