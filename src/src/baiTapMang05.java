import java.util.Arrays;
import java.util.Scanner;

public class baiTapMang05 {
    public static void main(String[] args) {
        int arr[] = new int[0];
        int q = 1;
        int a;
        do {
            System.out.println("nhap so 0 de ket thuc mang");
            int arr2[] = new int[arr.length+q];
            a = new Scanner(System.in).nextInt();
            if (a !=0){
            for (int i = 0; i < arr2.length; i++) {
                if (arr.length == i){
                    arr2[i] = a;
                }else arr2[i] = arr[i];
            }
            arr = arr2;
            }
        }while (a != 0);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);

    }
}
