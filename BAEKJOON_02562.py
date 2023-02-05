num = []
for a in range(9):
    num.append(int(input()))
print(max(num))
print(num.index(max(num))+1)