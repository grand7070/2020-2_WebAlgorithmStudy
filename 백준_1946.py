import sys
input = sys.stdin.readline

for _ in range(int(input())) :
    num = int(sys.stdin.readline())
    tmp = sorted([list(map(int, sys.stdin.readline().strip().split())) for x in range(num)], key = lambda x : x[0])

    count = 1
    min = tmp[0][1]
    for j in range(1, num) :
        if tmp[j][1] < min :
            min = tmp[j][1]
            count += 1
    print(count)