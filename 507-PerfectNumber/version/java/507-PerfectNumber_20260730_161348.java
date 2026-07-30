// Last updated: 7/30/2026, 4:13:48 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int fact=0;
4        for(int i=1;i<num;i++){
5            if(num%i==0){
6                fact+=i;
7            }
8        }
9        if(fact==num){
10            return true;
11        }
12        return false;
13    }
14}