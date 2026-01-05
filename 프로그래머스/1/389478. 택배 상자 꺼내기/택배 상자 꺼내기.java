// 꺼내려는 상자의 윗 상자 정보를 알면 됨
// 꺼내려는 상자 윗 상자
import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int floor = (int) Math.ceil((double) n / w);
        int[][] arr = new int[floor][w];
        
        int box = 1;
        int row = 0, col = 0;

        for (int i = 0; i < floor; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if (box == num) { 
                        row = i; 
                        col = j; 
                    }
                    
                    arr[i][j] = box++;
                    
                    if (box > n) 
                        break;
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    if (box == num) { 
                        row = i; 
                        col = j; 
                    }
                    
                    arr[i][j] = box++;
                    
                    if (box > n) 
                        break;
                }
            }
        }
        
        int answer = 0;
        for (int i = row; i < floor; i++) {
            if (arr[i][col] != 0) answer++;
        }
        return answer;
    }
}