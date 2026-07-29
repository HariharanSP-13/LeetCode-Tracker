// Last updated: 7/29/2026, 4:14:25 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5        int arr[][]=new int[m][n];
6        for(int i=0;i<m;i++)
7        {
8            for(int j=0;j<n;j++)
9            {
10            arr[i][j]=matrix[j][i];
11            }
12        }
13        return arr;
14    }
15}