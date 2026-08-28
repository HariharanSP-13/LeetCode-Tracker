// Last updated: 8/28/2026, 1:40:07 PM
1class Solution {
2    //test
3    public boolean search(int[] nums, int target) {
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target)
6                return true;
7        }
8        return false;
9    }
10}