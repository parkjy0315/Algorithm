class Solution {
    public String solution(String phoneNumber) {
        return "*".repeat(phoneNumber.length() - 4) + phoneNumber.substring(phoneNumber.length() - 4);
    }
}