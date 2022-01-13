'''
    문제 이름 : 풍선 터뜨리기
    문제 번호 : 2346
    문제 링크 : https://www.acmicpc.net/problem/2346
'''

# deque 쓰는 문제
import sys
from collections import deque
read = sys.stdin.readline

N = int(read())
# enumerate : 인덱스 번호와 컬렉션의 원소를 tuple 형태로 반환
ballons = deque(enumerate(map(int, read().split())))
result = []

while len(ballons) != 0:
    idx, paper = ballons.popleft()
    result.append(idx + 1)

    # 이미 한개가 빠진 상태이므로
    if paper < 0:
        # 음수일 경우 + 1
        ballons.rotate(-paper)
    elif paper > 0:
        # 양수일 경우 -1
        ballons.rotate(-(paper - 1))

print(' '.join(map(str, result)))
