import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for (char ch : input.toCharArray()) {
            System.out.print(ch - 'A' + 1 + " ");
        }
    }
}