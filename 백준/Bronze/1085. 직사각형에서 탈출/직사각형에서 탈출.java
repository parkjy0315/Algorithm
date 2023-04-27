import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = input[0], y = input[1];
        int w = input[2], h = input[3];


        int answer = Math.min(x, Math.min(y, Math.min(h - y, w - x)));
        System.out.println(answer);
    }
}