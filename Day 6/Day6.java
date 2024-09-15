import java.util.*;
/*
Find All Subarrays with Zero Sum

You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.

Input:
An integer array arr of size n where n represents the number of elements in the array.
Example : 
Input: [1, 2, -3, 3, -1, 2]

Output:
Return a list of tuples, where each tuple contains two integers. The starting index (0-based) of the subarray. The ending index (0-based) of the subarray.
The output should list all subarrays that sum to zero. If no such subarrays are found, return an empty list.
Example
Output: [(0, 2), (2, 3)]
 */

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<int[]> zeroSumSubarrays = zeroSumSubarrays(arr,n);
        print(zeroSumSubarrays,n);
        sc.close();

    }
    public static List<int[]> zeroSumSubarrays(int[] arr,int n) {
        List<int[]> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                int startIndex = map.get(sum) + 1;
                ans.add(new int[]{startIndex, i});
            }

            map.put(sum, i);
        }

        if (n> 0 && arr[0] == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    ans.add(new int[]{i, j});
                }
            }
        }

        return ans;
    }
    public static void print(List<int[]>arr, int n){
        for (int[] subarray : arr) {
            System.out.print("[" + subarray[0] + ", " + subarray[1] + "] ");
        }
    }
}