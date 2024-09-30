import java.util.*;

/*
First Element to Repeat k Times

You are given an array of integers and an integer k. Your task is to find the first element in the array that appears exactly k times. If no such element exists, return -1.

Input:
An integer array arr of size n, where 1≤n≤105
An integer k, where 1≤k≤n

Output:
Return the first element from the array that occurs exactly k times. If no element occurs exactly k times, return -1.

Examples:
Example 1
Input: arr = [3, 1, 4, 4, 5, 2, 6, 1, 4], k = 2
Output: 1
Explanation: 
Element 1 appears twice in the array (at index 1 and index 7), making it the first element that appears exactly 2 times.
 */

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(firstElementToRepeatKTimes(arr, k, n));
        sc.close();
    }

    public static int firstElementToRepeatKTimes(int[] arr, int k, int n) {
        int p1 = 0, p2 = 0;
        while (p1 < n) {
            int count = 0;
            while (p2 < n) {
                if (arr[p1] == arr[p2]) {
                    count++;
                }
                p2++;
            }
            if (count == k) {
                return arr[p1];

            }
            p1++;
            p2 = 0;
        }
        return -1;
    }
}