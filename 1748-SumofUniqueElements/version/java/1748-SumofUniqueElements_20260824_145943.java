// Last updated: 8/24/2026, 2:59:43 PM
1import java.util.*;
2class Solution {
3    public int sumOfUnique(int[] nums) {
4        HashMap<Integer,Integer> map=new HashMap<>();
5        int sum=0;
6        for(int i=0;i<nums.length;i++){
7            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
8            if(map.get(nums[i])==1){
9                sum+=nums[i];
10            }
11            else if(map.get(nums[i])==2){
12                sum-=nums[i];
13            }
14        }
15        return sum;
16    }
17}