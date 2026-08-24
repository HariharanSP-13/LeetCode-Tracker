// Last updated: 8/24/2026, 11:16:17 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        //test
4        int index=0,flag=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                index=i;
8                flag=1;
9            }
10        }
11        if(flag==1)
12            return index;
13        else 
14        return -1;
15    }
16}