import java.io.*;
import java.util.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        

    public static void dfs(int[][] graph, int v) throws Exception {
        Stack<Integer> stack = new Stack<>() {{ push(v); }};

        int N = graph.length;
        boolean[] visited = new boolean[N];

        while(!stack.isEmpty()) {
            int current = stack.pop();
            
            if (!visited[current - 1]) {
                visited[current - 1] = true;
                bw.write(current + " ");
            }

            for (int i = N; i > 0; i--) {
                if (!visited[i - 1] && graph[current - 1][i - 1] == 1) {
                    stack.push(i);
                }
            }
        }

        bw.write("\n");
    }

    public static void bfs(int[][] graph, int v) throws Exception {
        Queue<Integer> queue = new LinkedList<>() {{ add(v); }};

        int N = graph.length;
        boolean[] visited = new boolean[N];

        while(!queue.isEmpty()) {
            int current = queue.poll();

            if (!visited[current - 1]) {
                visited[current - 1] = true;
                bw.write(current + " ");

                for (int i = 1; i <= N; i++) {
                    if (!visited[i - 1] && graph[current - 1][i - 1] == 1) {
                        queue.add(i);
                    }
                }
            }
        }

        bw.write("\n");
    }

    public static void main(String[] args) throws Exception{
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int[][] graph = new int[N][N];
        for (int i = 0; i < M; i++) {
            String[] vertex = br.readLine().split(" ");
            int from = Integer.parseInt(vertex[0]) - 1;
            int to = Integer.parseInt(vertex[1]) - 1;

            graph[from][to] = graph[to][from] = 1;
        }
        
        dfs(graph, V);
        bfs(graph, V);
        
        br.close();
        bw.close();
    }
}