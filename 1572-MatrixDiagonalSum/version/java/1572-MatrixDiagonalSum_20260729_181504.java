// Last updated: 7/29/2026, 6:15:04 PM
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int n=mat.length;
4        int sum=0;
5        for(int i=0;i<mat.length;i++){
6                sum+=mat[i][i];
7                sum+=mat[i][n-1-i];
8        }
9        if(n%2==1){
10            sum-=mat[n/2][n/2];
11        }
12        
13        return sum;
14    }
15}