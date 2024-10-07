import java.util.*;
/*
Fibonacci Sequence using Dynamic Programming

You are given an integer n. Your task is to calculate the n-th Fibonacci number using Dynamic Programming.
The Fibonacci sequence is a series of numbers where:
F(0)=0
F(1)=1
For n≥2, F(n)=F(n−1)+F(n−2)
Your task is to compute F(n) efficiently by using a bottom-up dynamic programming approach, avoiding redundant calculations.


Input:
A single integer n (0 ≤ n ≤ 1000).

Output:
Return the n-th Fibonacci number.
 */
public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}

