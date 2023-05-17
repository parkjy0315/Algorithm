import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++)
            list.add(i);

        int index = 1;
        for (int i = 0; i < N - 1; i++) {
            int temp = list.get(index);
            list.add(temp);
            index += 2;
        }

        bw.write(list.get(list.size() - 1) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}