class Solution {
    public int solution(int n, int m, int[] section) {
        int[] wall = new int[n + 1];
        for (int s : section) {
            wall[s] = 1;
        }

        int answer = 0;
        for (int s : section) {
            if (wall[s] != 0) {
                for (int j = s; j < (s + m <= n + 1 ? s + m : n + 1); j++) {
                    wall[j] = 0;
                }
                answer++;
            }
        }

        return answer;
    }
}