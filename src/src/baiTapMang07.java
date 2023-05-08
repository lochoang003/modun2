import java.awt.*;
import java.util.Scanner;

public class baiTapMang07 {
    public static void main(String[] args) {
        int arr[][]= {{1,3,4},{3,4,5},{1,2,3}};
        int count = 0;
        int a = new Scanner(System.in).nextInt();
        for (int i = 0; i < arr.length  ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == a){
                    count += arr[i][a];
                }
            }
        }
        System.out.println(count);
    }
}
