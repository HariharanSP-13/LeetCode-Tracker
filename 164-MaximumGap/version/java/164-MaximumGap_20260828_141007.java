// Last updated: 8/28/2026, 2:10:07 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        if(nums.length < 2)
4            return 0;
5        Arrays.sort(nums);
6        int maxDiff = 0;
7        for(int i=0;i<nums.length-1;i++){
8            maxDiff = Math.max(maxDiff, nums[i+1] - nums[i]);
9        }
10        return maxDiff;
11    }
12}