import java.util.*;
/*
Evaluate a Postfix Expression

Given a postfix expression (also known as Reverse Polish Notation), your task is to evaluate the expression and return the result. The expression can contain integers and the four basic arithmetic operators +, -, *, and /. Assume that the input is always valid and the division operator performs integer division, truncating towards zero.

Input:
A string representing a postfix expression where operands and operators are separated by spaces.
The string contains only integers (both positive and negative) and the operators +, -, *, and /.

Output:
An integer representing the result of evaluating the postfix expression.

Examples:
Example 1
Input: "2 1 + 3 *"
Output: 9
Explanation: 
First, 2 and 1 are pushed onto the stack.
Encountering '+', 1 and 2 are popped, added to get 3, and pushed back onto the stack.
Then, 3 is pushed onto the stack.
Encountering '*', 3 and 3 are popped, multiplied to get 9, and pushed back onto the stack.
The final result is 9.
 */
public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        double ans = postFixEvaluation(str);
        System.out.println(ans);
        sc.close();
    }

    public static double postFixEvaluation(String str) {
        Stack<Double> stack = new Stack<>();
        String[] chars = str.split(" ");

        for (String ch : chars) {
            if (isOperator(ch)) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(compute(a, b, ch));
            } else {
                stack.push(Double.parseDouble(ch));
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(String ch) {
        return "+-*/^".contains(ch);
    }

    public static double compute(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "^": return Math.pow(a, b);
            default: return 0;
        }
    }
}
