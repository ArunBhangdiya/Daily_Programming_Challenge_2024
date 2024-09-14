import java.util.*;
/*
Find the Leaders in an Array

You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Input:
An integer array arr of size n.
Example : 
arr = [16, 17, 4, 3, 5, 2]

Output:
Return an array containing all the leader elements in the order in which they appear in the original array.
Example:
Leaders: [17, 5, 2]

 */

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        ans = findLeader(arr, n);
        printArray(ans);
        sc.close();
    }
    public static List<Integer> findLeader(int[] arr, int n){
        List<Integer> arr2 = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i=n-1;i>=0;i--) {
                if(arr[i]>=max){
                    arr2.add(arr[i]);
                    max = arr[i];
                }
        }
        return arr2;
    }
    public static void printArray(List<Integer> arr){
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }    
}
