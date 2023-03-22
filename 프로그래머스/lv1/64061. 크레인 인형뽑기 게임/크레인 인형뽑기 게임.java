import java.util.Stack;

class Solution {
    public int getRow(int[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 0) {
                return i;
            }
        }
        return -1;
    }

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int column : moves) {
            int row = getRow(board, column - 1);
            if (row != -1) {
                int doll = board[row][column - 1];
                int pre = !stack.isEmpty() ? stack.peek() : -1;
                board[row][column - 1] = 0;
                if (pre == doll) {
                    answer += 2;
                    stack.pop();
                } else {
                    stack.push(doll);
                }
            }
        }
        return answer;
    }
}