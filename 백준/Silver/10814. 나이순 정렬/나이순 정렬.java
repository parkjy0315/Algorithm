import java.io.*;
import java.util.*;

public class Main {
    public static class Data {
        String age;
        String name;

        public Data(String age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getAge() { return age; }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Data[] arr = new Data[N];
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");

            arr[i] = new Data(split[0], split[1]);
        }
        Arrays.sort(arr, Comparator.comparing(data -> Integer.parseInt(data.age)));

        for(int i=0; i<N; i++)
            bw.write(arr[i].age + " " + arr[i].name + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}