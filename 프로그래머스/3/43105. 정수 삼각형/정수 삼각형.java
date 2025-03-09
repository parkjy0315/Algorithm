import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] sum = new int[triangle.length][];
        sum[0] = new int[1];
        sum[0][0] = triangle[0][0];
        
        for (int i = 1; i < triangle.length; i++) {
            sum[i] = new int[triangle[i].length];
            
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) {
                    sum[i][j] = sum[i - 1][j] + triangle[i][j];   
                } else if (j == triangle[i].length - 1) {
                    sum[i][j] = sum[i - 1][j - 1] + triangle[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i - 1][j - 1], sum[i - 1][j]) + triangle[i][j];
                }
            }            
        }
        
        return Arrays.stream(sum[triangle.length - 1]).max().getAsInt();
    }
}