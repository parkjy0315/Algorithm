import java.util.*;

class Solution {
    public boolean outOfRange(int x, int y, int xSize, int ySize) {
        if (x < 0 || y < 0 || x >= xSize || y >= ySize) return true;
        else return false;
    }

    public void setExplosion(int [][] board, int x, int y) {
        for(int i=x-1; i<=x+1; i++) {
            for(int j=y-1; j<=y+1; j++) {
                if(!outOfRange(i, j, board.length, board.length))
                    board[i][j] = 1;
            }
        }
    }

    public List<int []> findMine(int [][] board) {
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 1) {
                    list.add(new int [] {i, j});
                }
            }
        }

        return list;
    }

    public int solution(int[][] board) {
        List<int []> minePos = findMine(board);
        for(int [] list : minePos) {
            setExplosion(board, list[0], list[1]);
        }

        return board.length * board.length - Arrays.stream(board).flatMapToInt(ints -> Arrays.stream(ints)).sum();
    }
}