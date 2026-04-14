// Problem  : Remove Duplicates from Sorted Array
// Difficulty: Easy
// Tags     : Array, Two Pointers
// URL      : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
