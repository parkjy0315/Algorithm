import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] idPw, String[][] db) {
        try {
            return Arrays.stream(db)
                .collect(Collectors.toMap(e -> e[0], e -> e[1]))
                .get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw"; }
        catch(NullPointerException e) {
            return "fail";
        }
    }
}