// Last updated: 9/7/2026, 4:23:07 PM
1
2class Solution {
3    public int minSubArrayLen(int target, int[] nums) {
4  // retry sync
5        int sum=0,res=Integer.MAX_VALUE,from=0;
6        for(int i=0;i<nums.length;i++){
7                sum+=nums[i];
8                while(sum>=target){
9                    res=Math.min(res,i-from+1);
10                    sum-=nums[from++];
11                }
12            
13        }
14        return (res==Integer.MAX_VALUE)? 0 : res;
15    }
16}