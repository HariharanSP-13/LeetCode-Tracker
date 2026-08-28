// Last updated: 8/28/2026, 2:08:11 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int prod;
4        int max=nums[0];
5        for(int i=0;i<nums.length;i++){
6            prod=1;
7            for(int j=i;j<nums.length;j++){
8                prod*=nums[j];
9                max=Math.max(prod,max);
10                
11            }
12        }
13        return max;
14    }
15}