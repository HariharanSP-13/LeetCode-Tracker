// Last updated: 8/24/2026, 2:00:06 PM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int c=0;
4       for(int i=0;i<nums.length;i++){
5        for(int j=i+1;j<nums.length;j++){
6            if(nums[i]==nums[j]){
7                c++;
8            }
9        }
10       }
11        return c;
12    }
13}