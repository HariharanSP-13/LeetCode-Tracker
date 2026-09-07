// Last updated: 9/7/2026, 4:26:50 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3       Arrays.sort(nums); 
4        
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] == nums[i - 1]) {
7                return true;
8            }
9        }
10        return false; 
11    }
12}