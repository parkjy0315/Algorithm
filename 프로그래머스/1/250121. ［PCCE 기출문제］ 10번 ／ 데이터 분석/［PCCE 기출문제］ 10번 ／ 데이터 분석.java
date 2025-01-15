import java.util.*;

class Solution {
    private Map<String, Integer> columnMap = new HashMap<>(){{
        put("code", 0);
        put("date",1);
        put("maximum",2);
        put("remain", 3);
    }};

    public int[][] solution(int[][] data, String ext, int valExt, String sortBy) {
        int extColumn = columnMap.get(ext);
        int sortColumn = columnMap.get(sortBy);

        return Arrays.stream(data)
            .filter(d -> d[extColumn] < valExt)
            .sorted((c1, c2) -> c1[sortColumn] - c2[sortColumn])
            .toArray(int[][]::new);
    }
}