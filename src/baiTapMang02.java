import java.util.Arrays;
import java.util.Scanner;

public class baiTapMang02 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 8};
        int j = 1;
        int a;
        do {
            System.out.println("nhap so them");
            a = new Scanner(System.in).nextInt();
            System.out.println("vi tri them");
            int viTri = new Scanner(System.in).nextInt();
            int arr2[] = new int[arr.length + j];
            for (int i = 0; i < arr2.length; i++) {
                if (viTri > i) {
                    arr2[i] = arr[i];
                } else if (viTri == i) {
                    arr2[i] = a;
                } else
                    arr2[i] = arr[i - 1];
            }
            System.out.println(Arrays.toString(arr));
            arr = arr2;
            System.out.println( Arrays.toString(arr));
            System.out.println(arr.length);


        } while (a != 0);
    }
}
