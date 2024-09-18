import java.util.*;
/*
Group Anagrams

You are given an array of strings strs[]. Your task is to group all the strings that are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
The goal is to return the grouped anagrams as a list of lists, where each sublist contains words that are anagrams of each other.

Input:
An array of strings strs[] consisting of lowercase English letters.

Output:
A list of lists, where each sublist contains strings that are anagrams of each other. The order of the output groups does not matter.

Examples:
Example 1
Input: strs[] = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
Explanation: 
i. "eat", "tea", and "ate" are anagrams of each other.
ii. "tan" and "nat" are anagrams of each other.
iii. "bat" has no anagram in the array, so it forms its own group.
 */
public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
           str[i]= sc.next();
        }
        List<List<String>> ans = groupAnagrams(str);
        for (List<String> list : ans) {
            System.out.print(list+" ");
        }
        sc.close();
    }
    public static List<List<String>> groupAnagrams(String[] arr){
        Map<String,List<String>> mp = new HashMap<>();
        for (String str : arr) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if(!mp.containsKey(sortedStr)){
                mp.put(sortedStr, new ArrayList<>());
            }
            mp.get(sortedStr).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}