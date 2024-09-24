import java.util.*;
/*
LCM (Least Common Multiple) of Two Numbers

You are given two integers, N and M. Your task is to find the Least Common Multiple (LCM) of these two numbers. The LCM of two integers is the smallest positive integer that is divisible by both N and M.

Input:
Two integers N and M, where 1≤N,M≤109

Output:
A single integer representing the Least Common Multiple of N and M.

Examples:
Example 1
Input: N = 4, M = 6
Output: 12
Explanation: The smallest number divisible by both 4 and 6 is 12.

 */
public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        System.out.println(lcm(n, m));
        sc.close();
    }
    public static int lcm(int n, int m){
        return (n*m)/ gcd(n, m);
    }
    public static int gcd(int n, int m){
        int gcd = 0;
        int k = Math.min(n,m);
        while (k>0) {
            if(n%k==0 && m%k==0){
                gcd=k;
                break;
            }
            k--;
        }
        return gcd;
    }
}
