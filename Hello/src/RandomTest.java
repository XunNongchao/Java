import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Random ran = new Random();

        for (int i = 0; i < 5; i++) {
            arr[i] = ran.nextInt(50);
        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean flag = false;

        for (int i :
                arr) {
            if (n == i) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("你赢了");
        } else {
            System.out.println("你输了");
        }

        System.out.println(Arrays.toString(arr));
    }
}
