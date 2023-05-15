
import java.io.*;
import java.util.*;

class Solution {
    public static int check(String password) {
        int[] arr = password.chars().map(ch -> ch - '0').toArray();
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 == 1) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }

        return (oddSum * 3 + evenSum) % 10 == 0 ? Arrays.stream(arr).sum() : -1;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] decode = {
                {"0001101", "0"},
                {"0011001", "1"},
                {"0010011", "2"},
                {"0111101", "3"},
                {"0100011", "4"},
                {"0110001", "5"},
                {"0101111", "6"},
                {"0111011", "7"},
                {"0110111", "8"},
                {"0001011", "9"},
        };

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            String code = "";
            for (int i = 0; i < N; i++) {
                String temp = br.readLine();
                if (temp.contains("1")) {
                    code = temp;
                }
            }


            int index = code.lastIndexOf('1');
            code = code.substring(index - 55, index + 1);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                String temp = code.substring(i * 7, (i + 1) * 7);
                for(int j=0; j<decode.length; j++) {
                    if (temp.equals(decode[j][0]))
                        sb.append(decode[j][1]);
                }
            }

            int sum = check(sb.toString());
            if (sum == -1)
                sum = 0;
            bw.write(String.format("#%d %d\n", test, sum));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

