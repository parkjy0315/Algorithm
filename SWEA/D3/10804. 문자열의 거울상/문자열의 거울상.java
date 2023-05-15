
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int test = 1; test <= T; test++) {
            bw.write(String.format("#%d ", test));

            String input = br.readLine();
            StringBuilder sb = new StringBuilder(input).reverse();

            for(int i=0; i<sb.length(); i++) {
                char ch = sb.charAt(i);
                switch(ch) {
                    case 'b':
                        sb = sb.replace(i, i+1, "d");
                        break;
                    case 'd':
                        sb = sb.replace(i, i+1, "b");
                        break;
                    case 'p':
                        sb = sb.replace(i, i+1, "q");
                        break;
                    case 'q':
                        sb = sb.replace(i, i+1, "p");
                        break;
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
