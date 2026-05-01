/*
# 파일명 정렬
- 저장소 서버는 프로그램의 과거 버전을 모두 기록
- 문자 코드 순으로 정렬되는게 아닌 숫자 순으로 정렬되는 기능을 구현하고자 함
- HEAD, NUMBER, TAIL 기준으로 정렬 후 리턴
*/

import java.util.*;

class Solution {

    public String[] solution(String[] files) {

        Arrays.sort(files, (o1, o2) -> {

            String head1 = getHead(o1);
            String head2 = getHead(o2);

            // HEAD 비교 (대소문자 무시)
            int headCompare = head1.compareToIgnoreCase(head2);

            if (headCompare != 0) {
                return headCompare;
            }

            // NUMBER 비교
            int number1 = getNumber(o1);
            int number2 = getNumber(o2);

            return number1 - number2;
        });

        return files;
    }

    private String getHead(String file) {

        int idx = 0;

        while (idx < file.length() &&
               !Character.isDigit(file.charAt(idx))) {

            idx++;
        }

        return file.substring(0, idx);
    }

    private int getNumber(String file) {

        int idx = 0;

        // 숫자 시작 위치 찾기
        while (!Character.isDigit(file.charAt(idx))) {
            idx++;
        }

        int start = idx;

        // 숫자 끝 위치 찾기
        while (idx < file.length() &&
               Character.isDigit(file.charAt(idx))) {

            idx++;
        }

        return Integer.parseInt(file.substring(start, idx));
    }
}
