import java.util.*;
/*
Problem: Find the duplicate number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.
Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output :
Return the duplicate integer present in the array.
Example: Duplicate Number : 3
 */
public class Day3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = duplicate(arr, n);
        System.out.println(ans);
        sc.close();
        
    }
    public static int duplicate(int[] arr, int n){
        int t = 0, h = 0;
        while (true) {
            t=arr[t];
            h=arr[arr[h]];
            if(t==h) break;
        }
        t=0;
        while (t!=h) {
            t=arr[t];
            h=arr[h];
        }
        return t;
    }
}