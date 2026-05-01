/*
# x => y 로 변환하기 (아래 3가지 연산 사용)
- x + n
- x * 2
- x * 3
- x, y, n 이 주어질 때 x 를 y 로 변환하기 위한 최소 연산 횟수 구하기

# 해결방법
- bfs 활용해서 각 연산 분기 처리
- 분기 처리 지점마다 연산 횟수 count
*/

import java.util.*;

class Solution {
    
    public int solution(int x, int y, int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];
        
        queue.add(new int[]{x, 0});
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            int value = current[0];
            int count = current[1];
            
            if (value == y) {
                return count;
            }
            
            int[] nextValues = {
                value + n,
                value * 2,
                value * 3
            };
            
            for (int next : nextValues) {
                
                if (next <= y && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, count+ 1});
                }
            }
        }
        
        return -1;
    }
    
}