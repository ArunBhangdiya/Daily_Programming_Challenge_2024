import java.util.*;
/*
Merge Two Sorted Arrays

You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Input:
Two sorted integer arrays arr1 of size m and arr2 of size n.
Example : 
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]

Output:
Both arr1 and arr2 should be sorted after the merge. Since you cannot use extra space, the final result will be reflected in arr1 and arr2.
Example:
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]

 */
public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        sortedArrays(arr1, arr2);
        print(arr1);
        print(arr2);
        sc.close();
    }
    public static void sortedArrays(int[] arr1, int[] arr2){
        int m = arr1.length, n = arr2.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1[i]>arr2[j]){
                    swap(arr1,i, arr2,j);
                }
            }   
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n ; j++) {
                if(arr2[i]>arr2[j]){
                    swap(arr2,i, arr2,j);
                }
            }   
        }       
    }

    public static void swap(int[] arr1, int i, int[] arr2, int j) {
        int temp = arr2[j];
        arr2[j] = arr1[i];
        arr1[i] = temp;
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }System.out.println();
    }
}