import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int STATION_NUM = 10;

    public static void main(String[] args) throws Exception {
        int[][] peopleInfo = new int[STATION_NUM][2];
        for (int i = 0; i < STATION_NUM; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            peopleInfo[i][0] = Integer.parseInt(st.nextToken());
            peopleInfo[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int total = 0;
        for (int i = 0; i < STATION_NUM; i++) {
            total += peopleInfo[i][1] - peopleInfo[i][0];
            max = Math.max(total, max);
        }

        bw.write(max + "\n");

        bw.close();
        br.close();
    }
}
