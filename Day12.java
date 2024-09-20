import java.util.*;
/*
Valid Parentheses with Multiple Types

You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.
A string is considered valid if:
Every opening bracket has a corresponding closing bracket of the same type.
The brackets are closed in the correct order. This means that a closing bracket must close the most recent unmatched opening bracket.

Input:
A string s consisting of characters (, ), {, }, [, and ].

Output:
Return true if the string is valid.
Return false if the string is invalid.
 */
public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(validParentheses(s1));
        sc.close();
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                        stack.push(')');
                        break;
                case '{':
                        stack.push('}');
                        break;
                case '[':
                        stack.push(']');
                        break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
