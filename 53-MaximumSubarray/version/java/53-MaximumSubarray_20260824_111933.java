// Last updated: 8/24/2026, 11:19:33 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        //test
4        int max=Integer.MIN_VALUE;
5        int csum=0;;
6        for(int i=0;i<nums.length;i++){
7             csum += nums[i];
8            if(csum>max){
9                    max=csum;
10            }
11            if(csum<0)
12              csum=0;
13            
14        }
15        return max;
16    }
17}