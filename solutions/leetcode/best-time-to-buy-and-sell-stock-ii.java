// Problem  : Best Time to Buy and Sell Stock II
// Difficulty: Medium
// Tags     : Array, Dynamic Programming, Greedy
// URL      : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Solved on: 2026-04-15 23:36
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        
        return profit;        
    }
}
