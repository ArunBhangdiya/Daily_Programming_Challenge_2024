import java.util.*;
/*
The Coin Change Problem

You are given an integer array coins[] of size n, where each element represents the denomination of a coin. You are also given an integer amount, representing the total amount of money. The task is to find the minimum number of coins required to make up the given amount.
If the amount cannot be formed by any combination of the coins, return -1.
You can assume that you have an infinite supply of each denomination.


Input:
An integer array coins[] where each element represents the value of a coin.
An integer amount representing the total amount of money.

Output:
Return the minimum number of coins needed to make up the amount.
If the amount cannot be formed by any combination of coins, return -1.
 */
public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(minCoins(arr, target));
        sc.close();
    }

    public static int minCoins(int[] arr, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, target + 1);
        dp[0] = 0;

        for (int coin : arr) {
            for (int i = coin; i <= target; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        if (dp[target] > target) {
            return -1;
        } else {
            return dp[target];
        }
    }
}
