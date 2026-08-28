// Last updated: 8/28/2026, 2:12:03 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0,val=0;
4        for(int num:nums){
5            if(count==0){
6                val=num;
7            }
8            count+=(num==val)? 1 : -1;
9        }
10        return val;
11        
12    }
13}