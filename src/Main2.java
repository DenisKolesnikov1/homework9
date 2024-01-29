import java.util.Arrays;
import java.util.Random;
public class Main2 {

    //Задача2
    public static void main(String[] args) {
     int[] expenses = generateRandomArray();
     int totalExpenses = 0;
     int minExpense = expenses[0];
     int maxExpense = expenses[0];

        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            }
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }

        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей." );
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000+1) + 100_000;
        }
        return arr;

    }
}