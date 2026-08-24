// Last updated: 8/24/2026, 11:16:53 AM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        //test
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>=target){
6                return i;
7            }
8        }
9        return nums.length;
10    }
11}