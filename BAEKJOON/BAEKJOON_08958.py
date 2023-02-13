x= int(input())
for i in range(x):
    oxinput = list(input())
    score = 0
    answer = 0
    for ox in oxinput:
        if ox=="O":
            score += 1
        elif ox=="X":
            score = 0
        answer += score
    print(answer)