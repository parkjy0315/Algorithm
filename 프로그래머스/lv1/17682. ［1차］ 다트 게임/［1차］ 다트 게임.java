import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        // 점수 결과 문자열을 split으로 나눔
        // 각 결과를 규칙에 맞게 처리
        String [] split = dartResult.split("");
        int [] score = new int[3];
        int scoreIdx = -1;
        for(int i=0; i<split.length; i++) {
            String s = split[i];
            switch(s) {
                case "1":
                    if(split[(i++)+1].equals("0"))
                        score[++scoreIdx] = 10;
                    else
                        score[++scoreIdx] = 1;
                    break;
                case "0": score[++scoreIdx] = 0; break;
                case "2": score[++scoreIdx] = 2; break;
                case "3": score[++scoreIdx] = 3; break;
                case "4": score[++scoreIdx] = 4; break;
                case "5": score[++scoreIdx] = 5; break;
                case "6": score[++scoreIdx] = 6; break;
                case "7": score[++scoreIdx] = 7; break;
                case "8": score[++scoreIdx] = 8; break;
                case "9": score[++scoreIdx] = 9; break;
                case "S": break;
                case "D": score[scoreIdx] = score[scoreIdx] * score[scoreIdx]; break;
                case "T": score[scoreIdx] = score[scoreIdx] * score[scoreIdx] * score[scoreIdx]; break;
                case "#": score[scoreIdx] *= -1; break;
                case "*":
                    if(scoreIdx != 0)
                        score[scoreIdx-1] *= 2;
                    score[scoreIdx] *= 2;
                    break;

            }
        }
        return Arrays.stream(score).sum();
    }
}