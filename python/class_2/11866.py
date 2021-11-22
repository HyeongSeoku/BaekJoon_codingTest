'''
    문제 이름 : 요세푸스 문제 0
    문제 번호 : 11866
    문제 링크 : https://www.acmicpc.net/problem/11866
'''
import sys
from collections import deque

read = sys.stdin.readline
deq = deque()
count = 1

N, K = map(int, read().split())

for i in range(1, N+1):
    deq.append(i)

print("<", end="")
while deq:
    # 원소가 하나 남았을 경우 바로 pop 해주고 뒤에 구분자 없이 출력
    if len(deq) == 1:
        print(deq.pop(), end="")
    # K와 count가 같을 경우
    elif count == K:
        print(deq.popleft(), end=", ")
        count = 1
    else:
        count += 1
        tmp = deq.popleft()
        deq.append(tmp)
print(">")
'''
큐에 1~N까지 입력
큐가 빌때까지
count가 k와 같을때 출력
같지 않다면 count +=1
popleft후 push
'''
