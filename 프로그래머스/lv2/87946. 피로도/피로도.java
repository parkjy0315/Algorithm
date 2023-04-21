
class Solution {
    boolean [] visited;
    int answer = 0;

    public void traverse(int k, int n, int[][] dungeons, int count) {
        for (int i = 0; i < n; i++) {
            if (visited[i] || dungeons[i][0] > k) {
                continue;
            }
            visited[i] = true;
            traverse(k - dungeons[i][1], n, dungeons, count + 1);
            visited[i] = false;
        }

        answer = Math.max(answer, count);
    }

    public int solution(int k, int[][] dungeons) {
        int length = dungeons.length;
        visited = new boolean[length];
        traverse(k, length, dungeons, 0);

        return answer;
    }
}