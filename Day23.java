import java.util.*;
/*
Sliding Window Maximum

You are given an array of integers arr and a positive integer k. Your task is to find the maximum element in each sliding window of size k. The window slides from left to right, one element at a time, and you need to return the maximum element for each of these windows.

Input:
An integer array arr of size n, where 1≤n≤105
An integer k, where 1≤k≤n

Output:
An array of size n−k+1 containing the maximum element from each sliding window.

Examples:
Example 1
Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]
Explanation: 
The first window is [1, 3, -1] → Maximum = 3
The second window is [3, -1, -3] → Maximum = 3
The third window is [-1, -3, 5] → Maximum = 5
The fourth window is [-3, 5, 3] → Maximum = 5
The fifth window is [5, 3, 6] → Maximum = 6
The sixth window is [3, 6, 7] → Maximum = 7
 */
public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(maximumElementArray(arr, k, n)));
        sc.close();
    }

    public static int[] maximumElementArray(int[] arr, int k, int n) {
        int[] ans = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }
        return ans;
    }
}
