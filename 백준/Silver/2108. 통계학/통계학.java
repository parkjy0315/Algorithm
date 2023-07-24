import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = IntStream.range(0, N)
                .map(i -> {
                    try {
                        return Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = map.values().stream().max(Integer::compareTo).orElse(0);
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modeList.add(entry.getKey());
            }
        }

        Collections.sort(modeList);

        bw.write(Math.round((double) Arrays.stream(arr).sum() / N) + "\n");
        bw.write(Arrays.stream(arr).sorted().toArray()[N / 2] + "\n");
        bw.write((modeList.size() == 1 ? modeList.get(0) : modeList.get(1)) + "\n");
        bw.write(Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt() + "\n");

        bw.close();
        br.close();
    }
}