import java.util.Scanner;

/**
 * 交换两个数
 */
public class Temp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

//        1：
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

//        2：
//        a = a + b;
//        b = a - b;
//        a = a - b;

//        3：
//        a = a + b - (b = a);


        System.out.println(a);
        System.out.println(b);
    }
}
