import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char A = st.nextToken().charAt(0);
        char B = st.nextToken().charAt(0);

        if (
            A == '1' && B == '3' ||
            A == '2' && B == '1' ||
            A == '3' && B == '2'
        )
            System.out.println("A");
        else if (
            A == '1' && B == '2' ||
            A == '2' && B == '3' ||
            A == '3' && B == '1'
        )
            System.out.println("B");
    }
}