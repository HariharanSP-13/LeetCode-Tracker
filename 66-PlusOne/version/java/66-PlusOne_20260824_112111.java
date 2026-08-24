// Last updated: 8/24/2026, 11:21:11 AM
1class Solution {
2    //test
3    public int[] plusOne(int[] digits) {
4        //syncnode
5        for(int i=digits.length-1;i>=0;i--){
6             if(digits[i] + 1 !=10){
7                digits[i]+=1;
8                return digits;
9            }
10        digits[i]=0;
11        }
12        int [] newDigits=new int[digits.length+1];
13        newDigits[0]= 1;
14        return newDigits;
15    }
16}