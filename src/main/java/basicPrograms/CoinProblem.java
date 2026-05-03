package basicPrograms;

import java.util.*;

public class CoinProblem {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        minCoinsWithCount(coins, amount);
    }

    static void minCoinsWithCount(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int[] lastCoin = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                    lastCoin[i] = coin;
                }
            }
        }
        if (dp[amount] > amount) {
            System.out.println("No solution possible");
            return;
        }

        System.out.println("Minimum coins = " + dp[amount]);

        Map<Integer, Integer> coinCount = new HashMap<>();
        int temp = amount;
        while (temp > 0) {
            int coin = lastCoin[temp];

            coinCount.put(coin, coinCount.getOrDefault(coin, 0) + 1);

            temp -= coin;
        }
        for (int coin : coinCount.keySet()) {
            System.out.println(coin + " → " + coinCount.get(coin) + " times");
        }
    }
}