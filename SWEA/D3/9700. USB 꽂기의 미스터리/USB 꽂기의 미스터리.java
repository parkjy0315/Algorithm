import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            bw.write(String.format("#%d ", test));

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double p = Double.parseDouble(st.nextToken());
            double q = Double.parseDouble(st.nextToken());

            // s1 = 처음 올바르지 않은 면 접촉 => 뒤집(1) => 정상적으로 꽂음
            double s1 = (1 - p) * q;
            // s2 = 처음 올바른 면 접촉 => 꽂히지 않음 => 뒤집(1) => 올바르지 않은 면 접촉 => 뒤집(2) => 올바른 면 접촉 => 정상적으로 꽂음
            double s2 = p * (1 - q) * q;
            if (s1 < s2)
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
