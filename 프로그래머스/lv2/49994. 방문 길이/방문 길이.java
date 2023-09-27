// 게임 캐릭터를 4가지 명령어를 통해 이동
// UDRL (한칸씩 이동)
// 0,0 시작

// 걸었던 길 체크 ? 
// 2차원 배열에 기록

class Solution {
    private int x = 5;
    private int y = 5;
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private boolean[][][][] visited = new boolean[11][11][11][11];

    public int solution(String dirs) {
        int total = 0;
        for (char dir : dirs.toCharArray()) {
            int nX = 0, nY = 0;
            if (dir == 'U') {
                nX = x + directions[0][0];
                nY = y + directions[0][1];                
            } else if(dir == 'D') {
                nX = x + directions[1][0];
                nY = y + directions[1][1];
            } else if(dir == 'L') {
                nX = x + directions[2][0];
                nY = y + directions[2][1];
                
            } else if(dir == 'R') {
                nX = x + directions[3][0];
                nY = y + directions[3][1];
            }
            
            if (0 <= nX && nX <= 10 && 0 <= nY && nY <= 10) {
                if (!visited[x][y][nX][nY]) {
                    total++;
                    visited[x][y][nX][nY] = visited[nX][nY][x][y] = true;    
                }
                x = nX;
                y = nY;
            }
            
        }
        
        return total;
    }
    
    
}