N, TS, P = map(int, input().split())
if N != 0:
    score_list = list(map(int, input().split()))
else:
    score_list = list()

score_list.append(TS)
score_list.sort(reverse=True)

rate = score_list.index(TS) + 1
if score_list.count(TS) > 1:
    if rate + score_list.count(TS) - 1 > P:
        rate = -1

if rate > P:
    rate = -1

print(rate)