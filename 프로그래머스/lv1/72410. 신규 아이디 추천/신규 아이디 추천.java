class Solution {
    // 새로 가입하는 유저의 아이디 규칙 확인
    // 규칙에 맞는 아이디 추천 프로그램
    // 규칙 1) 3 <= 아이디 길이 <= 15
    // 규칙 2) lowercase, digit, '-', '_', '.' 만 가능
    // 규칙 3) '.'(마침표) 처음과 끝에 사용X, 연속 사용X
    public String step1(String newId) {
        return newId.toLowerCase();
    }

    public String step2(String newId) {
        return newId.replaceAll("[^-_.a-z0-9]", "");
    }

    public String step3(String newId) {
        return newId.replaceAll("[.]{2,}", ".");
    }

    public String step4(String newId) {
        return newId.replaceAll("^[.]|[.]$", "");
    }

    public String step5(String newId) {
        return newId.equals("") ? "a" : newId;
    }

    public String step6(String newId) {
        if (newId.length() >= 16 ) {
            newId = newId.substring(0, 15);
            newId = newId.replaceAll("[.]$", "");
        }
        return newId;
    }

    public String step7(String newId) {
        if (newId.length() <= 2) {
            while(newId.length() != 3) {
                newId += newId.charAt(newId.length() - 1);
            }
        }
        return newId;
    }

    public String solution(String newId) {
        newId = step1(newId);
        newId = step2(newId);
        newId = step3(newId);
        newId = step4(newId);
        newId = step5(newId);
        newId = step6(newId);
        newId = step7(newId);

        return newId;
    }
}