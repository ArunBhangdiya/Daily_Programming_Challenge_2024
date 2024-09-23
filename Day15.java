import java.util.*;
/*
Find the Longest Substring Without Repeating Characters

You are given a string S, and your task is to find the length of the longest substring that contains no repeating characters. A substring is a contiguous block of characters in the string.
In this problem, you need to find the length of the longest substring where all the characters are unique. The substring can be formed by starting at any position in the string, but it must not contain any repeated characters.

Input:
A string S, where 1≤∣S∣≤105(length of string).

Output:
An integer representing the length of the longest substring without repeating characters.

Examples:
Example 1
Input: S = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with a length of 3. Even though the string contains repeated characters, the longest substring without duplicates is "abc".
 */
public class Day15 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n = s1.length(); 
        int ans = longestSubstring(s1, n);
        System.out.println(ans);
        sc.close();
   }
   public static int longestSubstring(String str, int n){
    int count = 0;
    int a = 0, b = 0;
    while (b < n) {
        for (int i = a; i < b; i++) {
            if (str.charAt(i)==str.charAt(b)) {
                a = i+1;
                break;
            }
        }
        count = Math.max(count, b-a+1);
        b++;
    }
    return count;
   }
}
