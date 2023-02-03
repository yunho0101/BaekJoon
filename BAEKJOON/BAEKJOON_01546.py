Num=int(input())
Sco=list(map(int,input().split()))
M=max(Sco)
print((sum(Sco)*100)/(Num*M))