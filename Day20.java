import java.util.*;
/*
Sort a Stack Using Recursion

Given a stack of integers, your task is to write a function that sorts the stack in ascending order. You are not allowed to use any additional data structure like arrays, lists, or another stack. The only operations you are allowed to perform are push, pop, and peek on the stack. The sorting must be performed using recursion only.

You need to recursively sort the stack, ensuring that after the sorting process, the stack remains sorted without using any additional data structures. You can only use the stack's own operations and recursion to solve this problem.

Input:
A stack containing integers. The stack may have positive, negative, or zero values.

Output:
The input stack should be sorted in ascending order (smallest elements on the top and largest at the bottom) after the sorting operation is performed.

Examples:
Example 1
Input: [3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 
Initially, the stack contains [3, 1, 4, 2].
After sorting using recursion, the stack becomes [1, 2, 3, 4].
 */
public class Day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }
        sortStack(stack);
        System.out.println(stack);
        sc.close();
    }

    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }

    public static void insertSorted(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, temp);
        stack.push(top);
    }
}