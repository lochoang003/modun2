import java.util.Arrays;
import java.util.Scanner;

public class baiTapMang04 {
    public static void main(String[] args) {
        int arr[][];
        System.out.println("mang lon");
        int a = new Scanner(System.in).nextInt();
        System.out.println("mang con");
        int b = new Scanner(System.in).nextInt();
        arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mang lon vi tri " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("so max la "+max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]== max){
                    System.out.println("vi tri mang lon thu " + (i + 1) + " vi tri mang con thu " + (j +1));
                }
            }
        }
    }
}
