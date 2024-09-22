import java.util.*;
/*import java.util.*;
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
Explanation: The possible substrings with exactly 2 distinct characters are: "pq", "pq", "qp", "pqp", "qpq", "pqpq","qs". Thus, there are 7 such substrings.
  */
public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int k = sc.nextInt();
        List<String> result = countSubstringsWithKDistinctCharacters(s1, k);
        for (String substring : result) {
            System.out.println(substring);
        }
        System.out.println(result.size());
        sc.close();
    }

    public static List<String> countSubstringsWithKDistinctCharacters(String s, int k) {
        int n = s.length();
        List<String> substrings = new ArrayList<>();
        for (int start = 0; start < n; start++) {
            Set<Character> distinctChars = new HashSet<>();
            for (int end = start; end < n; end++) {
                distinctChars.add(s.charAt(end));
                
                if (distinctChars.size() > k) {
                    break;
                }
                
                if (distinctChars.size() == k) {
                    substrings.add(s.substring(start, end + 1));
                }
            }
        }

        return substrings;
    }
}
