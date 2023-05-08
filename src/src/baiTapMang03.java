import java.util.Arrays;

public class baiTapMang03 {
    public static void main(String[] args) {
        int arr1 [ ] ={3,2,1,4,5,6,2};
        int arr2[]={4,5,6,7,8};
        int arr3[]=new int[arr1.length+arr2.length];
        int j =0;
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3 [i] = arr2[j];
            j++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
