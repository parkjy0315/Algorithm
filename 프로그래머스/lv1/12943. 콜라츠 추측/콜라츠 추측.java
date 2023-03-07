class Solution {
    public int solution(int num) {
        if (num == 1) return 0;
        else {
            int count = 0;
            long temp = num;
            
            while(temp != 1) {
                if(count >= 500)
                    return -1;

                if(temp % 2 == 0)
                    temp /= 2;
                else
                    temp = temp * 3 + 1;
                count++;
            }
            
            return count;
        }
    }
}