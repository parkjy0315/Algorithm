import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);

			String[] numbers = br.readLine().split(" ");

			Queue<int[]> queue = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				queue.add(new int[]{i, Integer.parseInt(numbers[i])});
			}

			int count = 0;
			while(!queue.isEmpty()) {
				int[] current = queue.poll();
				int max = current[1];
				
				for (int[] arr : queue) {
					if (max < arr[1]) {
						max = arr[1];
						break;
					}
				}

				if (max == current[1]) {
					count++;

					if (current[0] == M) {
						break;
					}
				} else {
					queue.add(current);
				}
			}

			bw.write(count + "\n");
		}
        

        bw.close();
        br.close();
    }
}
