/*
Sort an Array of 0s, 1s, and 2s

You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

Input:
An integer array arr of size n where each element is either 0, 1, or 2.
Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]

Output:
The sorted array, arranged in increasing order of 0s, 1s, and 2s.
Example: [0, 0, 0, 1, 1, 1, 2, 2]
 */

import java.util.*;
class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        print(arr);
    }
    public static void sort(int[]arr){
        int cZ = 0, cO = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==0){
                cZ++;
            }else if(arr[i]==1){
                cO++;
            }
        }
        int i = 0;
        while(i<cZ){
            arr[i] = 0;
            i++;
        }
        while(i<cZ+cO){
            arr[i] = 1;
            i++;
        }
        while(i<arr.length){
            arr[i] = 2;
            i++;
        }
    }
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}