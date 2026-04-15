// Problem  : Majority Element
// Difficulty: Easy
// Tags     : Array, Hash Table, Divide and Conquer, Sorting, Counting
// URL      : https://leetcode.com/problems/majority-element/
// Solved on: 2026-04-15 23:36
// ──────────────────────────────────────────────────

class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;
        int majEle = nums[0];

        for(int num : nums){
            if(num == majEle){
                freq+=1;
            }else{
                if(freq == 0){
                    majEle = num;
                    freq += 1;
                }else{
                    freq-=1;
                }

            }
        }

        return majEle;
    }
}
