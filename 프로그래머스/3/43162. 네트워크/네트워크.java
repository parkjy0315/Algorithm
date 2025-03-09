// 속해있는 노드를 기준으로 탐색

import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Stack<Integer> stack = new Stack();
        int network = 0;

        for (int i = 0; i < n; i++) {
            if (computers[i][i] != 0) {
                stack.push(i);    
                network++;
                computers[i][i] = 0;
            }
            
            while(!stack.isEmpty()) {
                int computer = stack.pop();
                
                for (int j = 0; j < computers[computer].length; j++) {
                    int value = computers[computer][j];
                    
                    if (value != 0) {
                        computers[computer][j] = 0;
                        computers[j][computer] = 0;
                        stack.push(j); 
                    }
                }   
            }
        }
        
        return network;
    }
}