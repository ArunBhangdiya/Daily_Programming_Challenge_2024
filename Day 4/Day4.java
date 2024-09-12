import java.util.*;
/**
 * Day4
 */
public class Day4 {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5}, arr2[] = {2,5,6};
        sortedArrays(arr1, arr2);
        print(arr1);
        print(arr2);
    }
    public static void sortedArrays(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1[i]>arr2[j]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }   
        }
        
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }System.out.println();
    }
}