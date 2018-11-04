import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
/**
 * 求任意整数的各位的和
 */
        System.out.print("请输入任意一个整数：");
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int t = s.nextInt();

        while(t!=0){
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println("各位数字的和：" + sum);
    }
}
