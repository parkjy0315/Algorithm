import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int index = -1;
        List<Integer> list = IntStream.rangeClosed(1, N)
                                    .boxed()
                                    .collect(Collectors.toList());

        bw.write("<");
        while (list.size() != 1) {
            for(int i=0; i<K; i++)
                index = (index + 1) % list.size();

            bw.write(String.valueOf(list.remove(index--)) + ", ");
        }
        bw.write(String.valueOf(list.get(0)));
        bw.write(">");

        bw.close();
        br.close();
    }
}