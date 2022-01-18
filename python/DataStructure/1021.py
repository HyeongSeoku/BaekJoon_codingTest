'''
    문제 이름 : 회전하는 큐
    문제 번호 : 1021
    문제 링크 : https://www.acmicpc.net/problem/1021
'''
import sys
from collections import deque

read = sys.stdin.readline

n, m = map(int, read().split())
target = list(map(int, read().split()))  # 찾으려는 수의 위치

deq = deque(i for i in range(1, n+1))
cnt = 0  # 정답이 담길 카운트

for i in target:
    while True:
        # 찾으려는 수가 deq의 첫번째 원소랑 같을경우
        if deq[0] == i:
            # 1번 수행
            deq.popleft()
            break  # 다음 타겟으로 넘어가기 위한 break
        # 탐색 시작
        else:
            # deq를 반으로 잘랐을때보다 타겟이 작으면 왼쪽으로 회전
            if deq.index(i) < len(deq) / 2:
                # 찾을때 까지 2번 동작 수행
                while deq[0] != i:
                    # 2번 동작 수행
                    deq.rotate(-1)  # 양수일 경우 오른쪽으로 돌기때문에
                    cnt += 1
            else:
                while deq[0] != i:
                    # 3번 동작 수행
                    deq.rotate(1)
                    cnt += 1

print(cnt)
