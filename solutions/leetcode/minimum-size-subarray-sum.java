// Problem  : Minimum Size Subarray Sum
// Difficulty: Medium
// Tags     : Array, Binary Search, Sliding Window, Prefix Sum
// URL      : https://leetcode.com/problems/minimum-size-subarray-sum/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

//


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right < nums.length;right++){
            sum += nums[right]; // 10

            while(sum >= target){
                minLength = Math.min(minLength,right - left +1); 
                sum -= nums[left]; 
                left++; 
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
