import java.io.*;
import java.util.Arrays;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            points[i] = new Point(x, y);
        }

        Arrays.sort(points, (p1, p2) -> {
            return p1.y == p2.y ? p1.x - p2.x : p1.y - p2.y;
        });

        for (int i=0; i<N; i++) {
            bw.write(points[i].x + " " + points[i].y + "\n");
        }

        bw.close();
        br.close();
    }
}