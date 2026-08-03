// Last updated: 8/3/2026, 10:37:08 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        for(long i=0;i*i<=c;i++){
4             double j=Math.sqrt(c-i*i);
5             if(j==(int)j)
6                return true;
7        }
8        return false;
9        
10    }
11}