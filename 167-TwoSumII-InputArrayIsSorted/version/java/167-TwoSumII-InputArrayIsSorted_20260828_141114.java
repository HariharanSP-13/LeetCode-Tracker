// Last updated: 8/28/2026, 2:11:14 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0,r=numbers.length-1;
4        while(l<r){
5            if(numbers[l]+numbers[r]==target)
6                return new int[] {l+1,r+1};
7            else if(numbers[l]+numbers[r]>target){
8                r--;
9            }
10            else
11            l++;
12        }
13        return new int[] {-1,-1};
14
15    }
16}