// Problem  : Merge Sorted Array
// Difficulty: Easy
// Tags     : Array, Two Pointers, Sorting
// URL      : https://leetcode.com/problems/merge-sorted-array/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

/*
[1,2,3,0,0,0]
[2,5,6]

[1,2,2,3,5,6] this output should be stored in nums1

                    p2 p1
nums1 = [1, 2 ,2 ,3 ,6 ,5];


 */


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mi = m -1;
        int ni = n-1;
        int right = m+n-1;

        while(ni >=0 ){
            if(mi >= 0 && nums1[mi] > nums2[ni]){
                nums1[right] = nums1[mi];
                mi--;
            }else{
                nums1[right] = nums2[ni];
                ni--;
            }
            right--;
        }
    }
}
