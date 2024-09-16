import java.util.*;
/*
Reverse a String Word by Word

You are given a string s that consists of multiple words separated by spaces. Your task is to reverse the order of the words in the string. Words are defined as sequences of non-space characters. The output string should not contain leading or trailing spaces, and multiple spaces between words should be reduced to a single space.

Input:
A string s of length n (1 ≤ n ≤ 10^4) consisting of letters, digits, punctuation, and spaces.

Output:
A string where the words in s are reversed, with a single space separating the words, and no leading or trailing spaces.
*/
public class Day8 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = reverseString(s1);
    System.out.println(ans);
    sc.close();
  }
  public static String reverseString( String str){
    str = str.replaceAll("\\s+", " ").trim();
    String[] s1 = str.split(" ");
    str="";
    for(String s:s1){
        str=s+" "+str;
    }
    return str;
  }
}
