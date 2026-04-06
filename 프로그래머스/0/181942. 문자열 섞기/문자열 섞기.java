class Solution {
    public String solution(String str1, String str2) {
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < chArr1.length; i++) {
            sb.append(chArr1[i]);
            sb.append(chArr2[i]);
        }
        
        return sb.toString();
    }
}