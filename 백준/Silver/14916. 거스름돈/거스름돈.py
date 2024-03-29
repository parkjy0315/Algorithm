# 춘향이가 편의점 카운터에서 일함
# 손님이 2원이랑 5원짜리로만 거스름돈 달랭
# 동전 개수가 최소가 되도록 거슬러 줄겅
# 거스름돈이 n인 경우 최소 동전 개수 구하기 (못 거슬러 주면 -1)

# n     2   5
# 1     -1
# 2     1   0   1
# 3     -1
# 4     2   0   2
# 5     0   1   1
# 6     3   0   3
# 7     1   1   2
# 8     4   0   4
# 9     2   1   3

# 10    0   2   2
# 11    -1
# 12    1   2   3
# 13    4   1   5
# 14    2   2   4
# 15    0   3   3

# n => min(dp[n-2], dp[n-5]) + 1 최소값보다 하나 더 추가한것

def solution(n):
    dp = [-1 for _ in range(n + 8)]
    dp[2] = 1
    dp[4] = 2
    dp[5] = 1
    dp[6] = 3
    dp[7] = 2
    dp[8] = 4

    for i in range(9, n+1):
        dp[i] = min(dp[i-2], dp[i-5]) + 1

    return dp[n]


n = int(input())
print(solution(n))
