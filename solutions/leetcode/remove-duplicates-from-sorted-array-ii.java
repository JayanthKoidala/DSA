// Problem  : Remove Duplicates from Sorted Array II
// Difficulty: Medium
// Tags     : Array, Two Pointers
// URL      : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 2;

        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
