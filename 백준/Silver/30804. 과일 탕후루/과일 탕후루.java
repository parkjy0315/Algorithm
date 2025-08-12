import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] S = Arrays.stream(br.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
    
        Map<Integer, Integer> countMap = new HashMap<>();
        int start = 0, maxCount = 0;
        
        for (int end = 0; end < N; end++) {
            countMap.put(S[end], countMap.getOrDefault(S[end], 0) + 1);

            while (countMap.size() > 2) {
                countMap.put(S[start], countMap.get(S[start]) - 1);

                if (countMap.get(S[start]) == 0) {
                    countMap.remove(S[start]);
                }

                start++;
            }

            maxCount = Math.max(maxCount, end - start + 1);
        }

        bw.write(maxCount + "\n");
        
        br.close();
        bw.close();
    }
}