// Problem  : Container With Most Water
// Difficulty: Medium
// Tags     : Array, Two Pointers, Greedy
// URL      : https://leetcode.com/problems/container-with-most-water/
// Solved on: 2026-04-13 19:19
// ──────────────────────────────────────────────────

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int currArea = (right-left) * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,currArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }
}
