import java.util.*;
/*
Reverse a Stack Using Recursion

You are given a stack of integers, and your task is to write a function that reverses the stack using recursion. You are not allowed to use any additional data structure (like arrays, lists, or another stack). The only operations you are allowed to perform are push, pop, and peek on the stack. The reversal must be done using recursion only.

Input:
A stack of integers. The stack may contain positive, negative, or zero values.

Output:
The stack should be reversed, meaning the element that was at the bottom of the original stack should become the topmost element after the reversal.

Examples:
Example 1
Input: [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: 
Initially, the stack contains [1, 2, 3, 4].
After the reversal using recursion, the stack becomes [4, 3, 2, 1].
 */
public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }
        reverseStack(stack);
        System.out.println(stack);
        sc.close();
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        insertReverse(stack, temp);
    }

    public static void insertReverse(Stack<Integer> stack, int temp) {
        if (stack.isEmpty()) {
            stack.push(temp);
            return;
        }

        int top = stack.pop();
        insertReverse(stack, temp);
        stack.push(top);
    }


}