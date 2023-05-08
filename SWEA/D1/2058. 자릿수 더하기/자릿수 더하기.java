import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int sum = 0;
        for(char ch : N.toCharArray()) {
            sum += ch - '0';
        }

        System.out.println(sum);
    }
}