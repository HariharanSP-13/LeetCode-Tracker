// Last updated: 8/24/2026, 11:22:01 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        //test
4        for(int i=0;i<nums.length-1;i++){
5            for(int j=0;j<nums.length-1;j++){
6                if(nums[j]>nums[j+1]){
7                    int temp=nums[j];
8                    nums[j]=nums[j+1];
9                    nums[j+1]=temp;
10                }
11            }
12        }
13        
14        
15    }
16}