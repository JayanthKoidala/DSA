// Problem  : Best Time to Buy and Sell Stock
// Difficulty: Easy
// Tags     : Array, Dynamic Programming
// URL      : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Solved on: 2026-04-15 23:36
// ──────────────────────────────────────────────────

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i : prices){
            minPrice = Math.min(minPrice, i);
            maxProfit = Math.max(maxProfit,i-minPrice);
        }

        return maxProfit;
    }
}
