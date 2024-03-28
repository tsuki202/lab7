import java.util.Random;
public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(41) - 20; // Генеруємо випадкове число від -20 до 20
        System.out.println("Випадкове натуральне число з проміжку [-20; 20]: " + randomNumber);
    }
}
