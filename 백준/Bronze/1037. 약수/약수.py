N = int(input())
div_list = list(int(x) for x in input().split())
max_n = max(div_list)
min_n = min(div_list)

print(max_n * min_n)