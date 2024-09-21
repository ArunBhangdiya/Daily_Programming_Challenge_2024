import java.util.*;
/*
Longest Palindromic Substring

You are given a string s. Your task is to find and return the longest palindromic substring within the given string. A palindrome is a string that reads the same forwards and backwards.

Input:
A string s of length n. The length of the string satisfies 1≤n≤1000.

Output:
Return the longest substring of s that is a palindrome. If there are multiple solutions, return the first one that occurs.

Examples:
Example 1
Input: "babad"
Output: "bab"
Explanation: Both "bab" and "aba" are palindromic substrings, but since "bab" appears first in the string, it is returned.
 */

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n = s1.length();
        String ans = longestPalindromicSubstring(s1,n);
        System.out.println(ans);
        sc.close();
    }
    public static String longestPalindromicSubstring(String s, int n) {
        int start = 0, end = 0;

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j) && j - i > end - start) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
