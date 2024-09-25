import java.util.*;
/*
Prime Factorization of a Number

Given a positive integer N, your task is to find its prime factorization. Return a list of prime numbers that multiply together to give N. If N is prime, the output should be a list containing only N.
Prime factorization is the process of breaking down a number into the set of prime numbers that, when multiplied together, result in the original number. For example, if N = 18, its prime factors are [2, 3, 3] because 2×3×3=18.

Input:
A single integer N, where 2≤N≤109

Output:
A list of prime numbers representing the prime factorization of N.

Examples:
Example 1
Input: N = 18
Output: [2, 3, 3]
Explanation: The prime factorization of 18 is 2 × 3 × 3.
 */

public class Day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = primeFactorization(num);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

    public static int[] primeFactorization(int num) {
        List<Integer> factors = new ArrayList<>();

        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }

        if (num > 2) {
            factors.add(num);
        }

        int[] ans = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            ans[i] = factors.get(i);
        }

        return ans;
    }
}
