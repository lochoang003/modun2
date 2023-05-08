import java.util.Scanner;

public class baiTapMang06 {
    public static void main(String[] args) {
        int soHS;
        int diem;
        int count =0;
        do {
            System.out.println("nhap so HS");
            soHS = new Scanner(System.in).nextInt();
            if (soHS> 30){
                System.out.println("nhap lai ");
            }
        }while (soHS>30);
        int arr[] = new int[soHS];
        for (int i = 0; i < arr.length; i++) {
          do {
              System.out.println("nhap diem ");
              diem = new Scanner(System.in).nextInt();
              if (diem < 0 || diem >10)
                  System.out.println("nhap lai ");
            }while (diem < 0 || diem >10);
          arr[i] = diem;
          if (diem > 5){
              count ++;
          }
        }
        System.out.println("so HS do la " + count);
    }
}
