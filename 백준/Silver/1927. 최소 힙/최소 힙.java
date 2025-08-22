import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());

			if (input > 0) {
				minHeap.add(input);
			} 
			else if (input == 0) {
				bw.write((minHeap.isEmpty() ? 0 : minHeap.poll()) + "\n");
			}	
		}

        bw.close();
        br.close();
    }
}
