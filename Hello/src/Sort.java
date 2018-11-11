import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {45, 12, 78, 97, 10};
        int len = a.length;


        //冒泡排序
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len - i - 1; j++) {  // for(int j = len-2; j >= i; j--)
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }


        //选择排序
//        for (int i = 0; i < len; i++) {
//            int min = i;
//            for (int j = i+1; j < len; j++) {
//                if (a[min] > a[j]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = a[i];
//                a[i] = a[min];
//                a[min] = temp;
//            }
//        }


        //直接插入排序
//        for (int i = 1; i < len; i++){
//            int temp = a[i];
//            int j;
//            for (j = i-1; j >= 0; j--){
//                if (a[j] > temp){
//                    a[j+1] = a[j];
//                } else {
//                    break;
//                }
//            }
//            a[j+1] = temp;
//        }


        System.out.println(Arrays.toString(a));
    }
}
