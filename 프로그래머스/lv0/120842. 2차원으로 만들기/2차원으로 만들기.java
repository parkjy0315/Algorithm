class Solution {
    public int[][] solution(int[] numList, int n) {
        int [][] arr = new int[numList.length/n][n];
        for(int i=0; i<numList.length / n; i++)
             for(int j=0; j<n; j++)
                 arr[i][j] = numList[i*n + j];

        return arr;
    }
}