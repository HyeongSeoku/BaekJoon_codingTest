'''
    문제 이름 : 카드 놓기
    문제 번호 : 18115
    문제 링크 : https://www.acmicpc.net/problem/18115
'''

import sys
from collections import deque;

read = sys.stdin.readline;

N = int(read())
skillArr = list(map(int,read().split()))
skillArr.reverse();

resultArr = list(range(1,N+1))
answerQ = deque([])

for i in range(N):
    skill = skillArr[i]
    if skill == 1:
        answerQ.appendleft(resultArr[i])
    elif skill == 2:
        answerQ.insert(1,resultArr[i])
    else :
        answerQ.append(resultArr[i])

answer = (list(answerQ))
print(*answer)
