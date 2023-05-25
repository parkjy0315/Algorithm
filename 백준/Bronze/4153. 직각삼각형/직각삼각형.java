import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int [] arr = new int[3];
            for(int i=0; i<arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;

            Arrays.sort(arr);
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}