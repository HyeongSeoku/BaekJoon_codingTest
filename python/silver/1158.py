'''
    문제 이름 : 요세푸스 문제
    문제 번호 : 1158
    문제 링크 : https://www.acmicpc.net/problem/1158
'''
import sys
from queue import Queue

n, k = map(int, sys.stdin.readline().split())
q = Queue()

result = []

for i in range(1, n+1):
    q.put(i)

    # 모든 사람이 빠질때까지
while not q.empty():
    # 큐에서 i번째 사람을 빼고 넣고 반복
    for i in range(k):
        num = q.get()

        if i == k-1:  # 찾으려는 사람 발견시
            result.append(num)
        else:
            q.put(num)  # 찾으려는 사람 아닐경우 다시 넣기
print(result)
