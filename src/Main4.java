import java.util.Arrays;
import java.util.Random;
public class Main4 {

    //Задача4
    public static void main(String[] args) {
      char[] reverseFullName = { 'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
