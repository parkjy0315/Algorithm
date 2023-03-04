
class Solution {
    public String solution(String polynomial) {
        int xRes = 0, res = 0;

        String[] split = polynomial.split(" ");
        for(int i=0; i<split.length; i++) {
            String temp = split[i];
            if(temp.equals("+")) {
                continue;
            } else if(temp.contains("x")) {
                xRes += temp.length() > 1 ? Integer.parseInt(temp.substring(0, temp.length() - 1)) : 1;
            } else {
                res += Integer.parseInt(temp);
            }
        }

        String xStr = (xRes == 0 ? null : xRes != 1 ? String.format("%dx", xRes) : "x");
        String valStr = (res == 0 ? null : String.valueOf(res));
        if(xStr != null && valStr != null) return xStr + " + " + valStr;
        else {
            if (xStr != null) return xStr;
            else if(valStr != null) return valStr;
            else return "0";
        }
    }
}