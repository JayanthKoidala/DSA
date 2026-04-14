// Problem  : Trapping Rain Water
// Difficulty: Hard
// Tags     : Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
// URL      : https://leetcode.com/problems/trapping-rain-water/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] lb = new int[len];
        int[] rb = new int[len];

        lb[0] = height[0];
        rb[len-1] = height[len-1];

        for(int i =1;i<len;i++){
            lb[i] = Math.max(lb[i-1],height[i]);
        }

        for(int i = len -2;i>=0;i--){
            rb[i] = Math.max(rb[i+1],height[i]);
        }

        int totalWater = 0;

        for(int i =0;i<len;i++){
            totalWater += (Math.min(rb[i],lb[i]) - height[i]);
        }

        return totalWater;
    }
}
