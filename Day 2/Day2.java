import java.util.*;
/**
Find the Missing Number

You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input:
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output:
Return the missing integer from the array.
Example: Missing number: 3

 */
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = missingNumber(arr,n+1);
        System.out.println(num);
        
    }
    public static int missingNumber(int[] arr,int n){
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for (int i : arr) {
            sum2+=i;
        }
        return sum1-sum2;
    }
}