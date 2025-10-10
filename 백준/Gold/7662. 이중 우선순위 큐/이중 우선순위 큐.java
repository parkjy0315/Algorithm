import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int test = 0; test < T; test++) {
            int k = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i < k; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int number = Integer.parseInt(st.nextToken());

                if (command == 'I') {
                    minHeap.offer(number);
                    maxHeap.offer(number);
                    countMap.put(number, countMap.getOrDefault(number, 0) + 1);
                } else if (command == 'D') {
                    if (countMap.isEmpty())
                        continue;

                    if (number == 1) {
                        while (!maxHeap.isEmpty()) {
                            int max = maxHeap.poll();
                            if (countMap.containsKey(max)) {
                                if (countMap.get(max) == 1) {
                                    countMap.remove(max);
                                } else {
                                    countMap.put(max, countMap.get(max) - 1);
                                }
                                break;
                            }
                        }
                    } else if (number == -1) {
                        while (!minHeap.isEmpty()) {
                            int min = minHeap.poll();
                            if (countMap.containsKey(min)) {
                                if (countMap.get(min) == 1) {
                                    countMap.remove(min);
                                } else {
                                    countMap.put(min, countMap.get(min) - 1);
                                }
                                break;
                            }
                        }
                    }
                }
            }

            if (countMap.isEmpty()) {
                bw.write("EMPTY\n");
            } else {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int num : countMap.keySet()) {
                    max = Math.max(max, num);
                    min = Math.min(min, num);
                }

                bw.write(max + " " + min + "\n");
            }
        }

        bw.close();
        br.close();
    }
}