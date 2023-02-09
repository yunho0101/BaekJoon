num = []
for i in range(10):
    a = int(input())%42
    num.append(a)
print(len(set(num)))
