import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final int MAP_SIZE = 8;

    public static boolean isPalindrome(List<Character> list) {
        int len = list.size();
        for (int i = 0; i < len / 2; i++) {
            if (list.get(i) != list.get(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int test = 1; test <= 10; test++) {
            // 회문의 길이
            int length = Integer.parseInt(br.readLine());
            // 테이블 정보 입력
            char[][] table = new char[MAP_SIZE][MAP_SIZE];
            for (int i = 0; i < MAP_SIZE; i++)
                table[i] = br.readLine().toCharArray();

            int count = 0;
            // 회문 길이만큼 반복해서 탐색
            for (int i = 0; i < MAP_SIZE; i++) {
                for (int j = 0; j < MAP_SIZE; j++) {
                    // 기준이 되는 시작점 (i, j)
                    List<Character> rowList = new ArrayList<>();
                    List<Character> colList = new ArrayList<>();
                    // 기준점으로 가로, 세로 List를 회문 체크
                    for (int k = 0; k < length; k++) {
                        if (j + k < MAP_SIZE) rowList.add(table[i][j + k]);
                        if (i + k < MAP_SIZE) colList.add(table[i + k][j]);
                    }

                    if (rowList.size() == length && isPalindrome(rowList))
                        count++;
                    if (colList.size() == length && isPalindrome(colList))
                        count++;
                }
            }
            System.out.printf("#%d %d\n", test, count);
        }
    }
}