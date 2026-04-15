// Problem  : Rotate Array
// Difficulty: Medium
// Tags     : Array, Math, Two Pointers
// URL      : https://leetcode.com/problems/rotate-array/
// Solved on: 2026-04-15 23:36
// ──────────────────────────────────────────────────

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }    
}
