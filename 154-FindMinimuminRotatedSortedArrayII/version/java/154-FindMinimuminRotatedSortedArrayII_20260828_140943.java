// Last updated: 8/28/2026, 2:09:43 PM
1class Solution {
2    public int findMin(int[] nums) {
3        //syncnode
4       int min=nums[0];
5       for(int i=0;i<nums.length;i++){
6        if(nums[i]<min){
7            min=nums[i];
8        }
9       }
10       return min;
11
12    }
13}