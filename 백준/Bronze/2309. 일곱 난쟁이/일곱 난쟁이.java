import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int TOTAL = 9;

    public static void main(String[] args) throws Exception {
        int[] heights = new int[TOTAL];

        for (int i = 0; i < TOTAL; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(heights);

        loop:
        for (int i = 0; i < TOTAL - 1; i++) {
            for (int j = i + 1; j < TOTAL; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k=0; k<TOTAL; k++) {
                    if (!(k == i || k == j)) {
                        sum += heights[k];
                        list.add(heights[k]);
                    }
                }

                if (sum == 100) {
                    for (int num : list) {
                        bw.write(num + "\n");
                    }

                    break loop;
                }
            }
        }

        bw.close();
        br.close();
    }
}