n, k = map(int, input().split())
list = []
count = 0

for i in range(n):
    list.append(int(input()))

list.reverse()

for i in range(n) :
    a = k // list[i]
    if a == 0 : continue
    count += a
    k -= a * list[i]

print(count)