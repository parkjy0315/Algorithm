import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            int max = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .max().getAsInt();
            System.out.printf("#%d %d\n", test, max);
        }
    }
}