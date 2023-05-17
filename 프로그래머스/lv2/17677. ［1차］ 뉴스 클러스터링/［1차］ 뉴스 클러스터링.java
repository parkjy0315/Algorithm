import java.util.*;

class Solution {
    public List<String> union(List<String> set1, List<String> set2) {
        List<String> res = new ArrayList<>(set1);
        res.addAll(set2);
        return res;
    }

    public List<String> intersection(List<String> set1, List<String> set2) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < set1.size(); i++) {
            String temp = set1.get(i);
            if (set2.contains(temp)) {
                res.add(temp);
                set2.remove(temp);
            }
        }

        return res;
    }

    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> set1 = new ArrayList<>();
        List<String> set2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i + 2);
            if (temp.matches("^[A-Z]*$")) {
                set1.add(temp);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = str2.substring(i, i + 2);
            if (temp.matches("^[A-Z]*$")) {
                set2.add(temp);
            }
        }

        List<String> unionSet = new ArrayList<>(set1);
        List<String> intersectionSet = null;
        unionSet.addAll(set2);
        if (set1.size() > set2.size()) {
            intersectionSet = intersection(set2, set1);
        } else {
            intersectionSet = intersection(set1, set2);
        }

        for (int i = 0; i < intersectionSet.size(); i++) {
            String temp = intersectionSet.get(i);
            if (unionSet.contains(temp)) {
                unionSet.remove(temp);
            }
        }

        if (unionSet.size() == 0 && intersectionSet.size() == 0)
            return 65536;

        return (int) ((double) intersectionSet.size() / unionSet.size() * 65536);
    }
}