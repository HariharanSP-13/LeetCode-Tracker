// Last updated: 8/21/2026, 10:04:30 PM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        Set<Integer> modSet=new HashSet();
4        int currSum = 0, prevSum=0;  
5        for(int n : nums) {
6            currSum += n;
7            if(modSet.contains(currSum%k)) {
8                return true;
9            }
10            currSum %=k;
11            modSet.add(prevSum);
12            prevSum = currSum;
13        }
14        return false;
15    }
16}