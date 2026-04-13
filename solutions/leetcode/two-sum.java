// Problem  : Two Sum
// Difficulty: Easy
// Tags     : Array, Hash Table
// URL      : https://leetcode.com/problems/two-sum/
// Solved on: 2026-04-13 19:19
// ──────────────────────────────────────────────────

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i = 0;i<nums.length;i++){
        int required = target - nums[i];
        if(map.containsKey(required)){
            return new int[]{i,map.get(required)};
        }else{
            map.put(nums[i],i);
        }
       }
       return new int[]{-1,-1};
    }
}
