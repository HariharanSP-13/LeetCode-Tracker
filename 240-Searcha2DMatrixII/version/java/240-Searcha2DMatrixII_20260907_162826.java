// Last updated: 9/7/2026, 4:28:26 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i=0;i<matrix.length;i++){
4            for(int j=0;j<matrix[i].length;j++){
5                if(matrix[i][j]==target)
6                    return true;
7            }
8        }
9        return false;
10    }
11}