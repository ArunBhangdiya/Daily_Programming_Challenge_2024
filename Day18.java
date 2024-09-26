import java.util.*;
/*
Count the Number of Divisors of a Number

Given a positive integer N, your task is to find the total number of divisors (factors) of N. A divisor of N is any integer that divides N without leaving a remainder.
A divisor of a number is any integer that divides the number evenly (i.e., without a remainder). For example, for N = 12, its divisors are 1, 2, 3, 4, 6, 12, so the total number of divisors is 6.

Input:
A single integer N, where 1≤N≤109

Output:
An integer representing the total number of divisors of N.

Examples:
Example 1
Input: N = 12
Output: 6
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, and 12.
 */
public class Day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numberOfDivisors(num));
        sc.close();
    }
    public static int numberOfDivisors(int num){
        int count= 0;
        int i = 1;
        while (i<=num) {
            if(num%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
}
