import java.io.*;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int T;
    private static int N;

    public static void main(String[] args) throws Exception {
        T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            N = Integer.parseInt(br.readLine());
            String[] mbti = br.readLine().split(" ");

            int min = Integer.MAX_VALUE;

            loop:
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int total = calcDist(mbti[i], mbti[j]) + calcDist(mbti[i], mbti[k]) + calcDist(mbti[j], mbti[k]);

                        if (min > total) {
                            min = total;
                        }

                        if (min == 0) {
                            break loop;
                        }
                    }
                }
            }

            bw.write(min + "\n");
        }


        bw.close();
        br.close();
    }

    public static int calcDist(String mbti1, String mbti2) {
        int dist = 0;

        for (int i = 0; i < 4; i++) {
            char ch1 = mbti1.charAt(i);
            char ch2 = mbti2.charAt(i);

            if (ch1 != ch2) {
                dist++;
            }
        }

        return dist;
    }
}