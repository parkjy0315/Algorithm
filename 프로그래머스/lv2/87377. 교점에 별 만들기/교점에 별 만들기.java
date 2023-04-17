import java.util.*;

class Solution {
    public boolean isInteger(double num) {
        return num == (long) num;
    }

    public double[] getIntersection(int[] line1, int[] line2) {
        double temp = line1[0] * line2[1] - line1[1] * line2[0];
        if (temp == 0)
            return null;

        return new double[]{
                ((double)line1[1] * line2[2] - (double)line1[2] * line2[1]) / temp,
                ((double)line1[2] * line2[0] - (double)line1[0] * line2[2]) / temp
        };
    }

    public String[] solution(int[][] line) {
        Set<Long[]> pointSet
                = new HashSet<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                double[] temp = getIntersection(line[i], line[j]);
                if (temp == null)
                    continue;

                if (isInteger(temp[0]) && isInteger(temp[1])) {
                    Long[] point = new Long[2];
                    point[0] = (long) (temp[0]);
                    point[1] = (long) (temp[1]);
                    pointSet
                            .add(point);
                }
            }
        }

        long minX = pointSet.stream().min((o1, o2) -> (int)(o1[0] - o2[0])).get()[0];
        long minY = pointSet.stream().min((o1, o2) -> (int)(o1[1] - o2[1])).get()[1];
        long maxX = pointSet.stream().max((o1, o2) -> (int)(o1[0] - o2[0])).get()[0];
        long maxY = pointSet.stream().max((o1, o2) -> (int)(o1[1] - o2[1])).get()[1];

        String[][] temp = new String[(int)(maxY - minY + 1)][];
        for (int i = 0; i < maxY - minY + 1; i++) {
            temp[i] = ".".repeat((int)(maxX - minX + 1)).split("");
        }

        for (Long[] point : pointSet) {
            int x = (int)(point[0] - minX);
            int y = (int)(point[1] - minY);
            temp[y][x] = "*";
        }

        String [] answer = new String[(int)(maxY - minY + 1)];
        for (int i = 0; i < maxY - minY + 1; i++) {
            answer[i] = String.join("", temp[(int)(maxY - minY - i)]);
        }
        return answer;
    }
}
