/*
사람의 덩치를 키, 몸무게로 표현해 등수를 매기려 함
각 나열된 사람의 덩치 등수를 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] peopleInfo = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            peopleInfo[i][0] = Integer.parseInt(temp[0]);
            peopleInfo[i][1] = Integer.parseInt(temp[1]);
        }

        for (int i = 0; i < N; i++) {
            int weight = peopleInfo[i][0];
            int height = peopleInfo[i][1];
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (weight < peopleInfo[j][0] && height < peopleInfo[j][1])
                    count++;
            }
            System.out.print(count + " ");
        }
    }
}