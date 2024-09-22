import java.util.*;
/*
Count Substrings with Exactly K Distinct Characters

You are given a string s of lowercase English alphabets and an integer k. Your task is to count all possible substrings of s that contain exactly k distinct characters.

Input:
A string s consisting of lowercase English letters.
An integer k, where 1 ≤ 𝑘 ≤ 26
The length of the string satisfies 1 ≤ 𝑛 ≤ 104

Output:
Return an integer that represents the number of substrings of s that contain exactly k distinct characters.

Examples:
Example 1
Input: s = "pqpqs", k = 2
Output: 7
Explanation: The possible substrings with exactly 2 distinct characters are: "pq", "pqp", "qp", "pqs", "pq", "qs", and "pq". Thus, there are 7 such substrings.
 */
public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int k = sc.nextInt();
        System.out.println(countOfUniqueSubstrings(s1, k));
        sc.close();
    }
    public static int countOfUniqueSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            charCount.clear();
            int distinctChars = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                if (charCount.get(c) == 1) {
                    distinctChars++;
                }
                if (distinctChars == k) {
                    count++;
                } else if (distinctChars > k) {
                    break;
                }
            }
        }

        return count;
    }

}