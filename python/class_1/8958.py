'''
    문제 이름 : OX 퀴즈
    문제 번호 : 8958
    문제 링크 : https://www.acmicpc.net/problem/8958
'''

case = int(input())

for i in range(case):
    cnt = 0
    bonus = 0
    myAnswer = input()
    for j in range(len(myAnswer)):
        if myAnswer[j] == "O":
            bonus += 1
            cnt += bonus
        else:
            bonus = 0

    print(cnt)
