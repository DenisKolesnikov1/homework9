import java.util.Arrays;
import java.util.Random;
public class Main {

    //Задача1
    public static void main(String[] args) {
        int[] ints = generateRandomArray();
        System.out.println(Arrays.toString(ints));
        int result = 0;
        for (int value : ints) {
            result = result + value;
        }

        System.out.println(result);
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
