import java.util.Random;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        // Генеруємо випадкову послідовність з трьох чисел [1; 3]
        Random random = new Random();
        int[] lotteryNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            lotteryNumbers[i] = random.nextInt(3) + 1;
        }

        // Виводимо привітання та правила гри
        System.out.println("Ласкаво просимо до гри 'Лотерея'!");
        System.out.println("Спробуйте вгадати послідовність трьох чисел від 1 до 3.");

        // Кількість спроб
        int attempts = 2;

        // Цикл гри
        while (attempts > 0) {
            System.out.println("\nУ вас залишилося " + attempts + " спроб.");
            System.out.print("Введіть послідовність трьох чисел через пробіл: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputNumbers = input.split(" ");

            // Перевірка на введення трьох чисел
            if (inputNumbers.length != 3) {
                System.out.println("Введіть рівно три числа!");
                continue;
            }

            // Перевірка на відповідність
            boolean isCorrect = true;
            for (int i = 0; i < 3; i++) {
                int guess = Integer.parseInt(inputNumbers[i]);
                if (guess != lotteryNumbers[i]) {
                    isCorrect = false;
                    break;
                }
            }

            // Виведення результату
            if (isCorrect) {
                System.out.println("Вітаємо! Ви вгадали правильну послідовність чисел: " +
                        lotteryNumbers[0] + " " + lotteryNumbers[1] + " " + lotteryNumbers[2]);
                break;
            } else {
                System.out.println("На жаль, ви не вгадали правильну послідовність чисел.");
                attempts--;
            }
        }

        // Повідомлення про кінець гри
        if (attempts == 0) {
            System.out.println("\nГра завершилася. Правильна послідовність чисел: " +
                    lotteryNumbers[0] + " " + lotteryNumbers[1] + " " + lotteryNumbers[2]);
        }
    }
}
