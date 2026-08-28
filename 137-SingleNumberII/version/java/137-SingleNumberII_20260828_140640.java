// Last updated: 8/28/2026, 2:06:40 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length;i++){
5            int d=0;
6            for(int j=0;j<nums.length;j++){
7                if(nums[i]==nums[j]){
8                    d++;
9                }
10            }
11            if(d==1){
12                c=nums[i];
13            }
14        }
15        return c;
16
17    }
18}