// Last updated: 8/3/2026, 10:59:36 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int s=0,e=nums.length-1;
4      while(s<=e){
5        int mid=s+(e-s)/2;
6        if(nums[mid]==target){
7            return mid;
8        }
9        else if(nums[mid]<target){
10            s=mid+1;
11        }
12        else
13            e=mid-1;
14       
15       }
16       return -1;
17    }
18}