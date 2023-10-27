import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];

        backTracking(0, "");

        bw.close();
        br.close();
    }

    public static void backTracking(int index, String result) {
        // 방문하지 않은 숫자라면 방문 => 재귀
        // M번째 숫자에 도착했을 때 반복 중지
        if (index == M) {
            System.out.println(result);
            return;
        }

        for (int i=1; i<=N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                backTracking(index + 1, result + i + " ");
                visited[i] = false;
            }
        }
    }
}