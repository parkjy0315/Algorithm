
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int test = 1; test <= T; test++) {
            String input = br.readLine();

            String[] result = new String[5];
            Arrays.fill(result, "");

            for (int i = 0; i < input.length(); i++) {
                result[0] += "..#.";
                result[1] += ".#.#";
                result[2] += "#." + input.charAt(i) + ".";
                result[3] += ".#.#";
                result[4] += "..#.";
            }

            result[0] += ".";
            result[1] += ".";
            result[2] += "#";
            result[3] += ".";
            result[4] += ".";

            for (int i = 0; i < 5; i++) {
                System.out.println(result[i]);
            }

        }
    }
}

