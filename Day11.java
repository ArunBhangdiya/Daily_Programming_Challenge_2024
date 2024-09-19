import java.util.*;

/*
Permutations of a String

You are given a string s. Your task is to generate and return all possible permutations of the characters in the string. A permutation is a rearrangement of the characters in the string, and each character must appear exactly once in every permutation. If there are duplicate characters in the string, the resulting permutations should also be unique (i.e., no repeated permutations).

Input:
A string s consisting of lowercase English letters. The length of the string n satisfies 1≤𝑛≤9.

Output:
An array of strings containing all unique permutations of the input string. The order of permutations in the output does not matter.

Examples:
Example 1
Input: "abc"
Output: ["abc", "acb", "bac", "bca", "cab", "cba"]
Explanation: All possible arrangements of "abc" are listed, and there are no duplicate permutations.
 */

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> permutations = permutations(str);
        System.out.println(permutations);
        sc.close();
    }
    public static List<String> permutations(String str) {
        List<String> ans = new ArrayList<>();
        permutation(str, "", new HashSet<>(), ans);
        return ans;
    }

    private static void permutation(String str, String s1, Set<String> seen, List<String> ans) {
        if (str.length() == 0) {
            if (!seen.contains(s1)) {
                ans.add(s1);
                seen.add(s1);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String s2 = str.substring(0, i) + str.substring(i + 1);
            permutation(s2, s1 + ch, seen, ans);
        }
    }
}