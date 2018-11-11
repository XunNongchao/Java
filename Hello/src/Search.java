import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] a = {3, 7, 15, 89, 99};
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int result = search(a, val);

        System.out.println(result);
    }


    //二分查找
    private static int search (int[] a, int val) {
        int low = 0;
        int high = a.length;

        do {
            int mid = (low + high) / 2;
            if (val < a[mid]) {
                high = mid - 1;
            } else if (val > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        } while (low <= high);

        return -1;
    }
}
