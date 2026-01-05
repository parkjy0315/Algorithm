// 꺼내려는 상자의 윗 상자 정보를 알면 됨
// 꺼내려는 상자 윗 상자
import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int totalRows = (int) Math.ceil((double) n / w);

        int row = (int) Math.ceil((double) num / w) - 1;
        int col = (num - 1) % w;

        if (row % 2 == 1) {
            col = w - 1 - col;
        }

        int answer = 1;
        for (int r = row + 1; r < totalRows; r++) {
            int c = (r % 2 == 0) ? col : (w - 1 - col);
            int boxNum = r * w + c + 1;
            if (boxNum <= n) answer++;
        }
        
        return answer;
    }
}