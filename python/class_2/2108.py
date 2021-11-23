'''
    문제 이름 : 통계학
    문제 번호 : 2108
    문제 링크 : https://www.acmicpc.net/problem/2108
'''

import sys
from collections import Counter
read = sys.stdin.readline

N = int(read())

numList = []

for _ in range(N):
    num = int(read())
    numList.append(num)

numList.sort()

print(round(sum(numList)/N))  # 산술평균
print(numList[len(numList)//2])  # 중앙값

# most_common : 데이터의 개수가 많은 순으로 정렬된 배열을 리턴하는
cnt = Counter(numList).most_common(2)  # 개수가 가장많은 k개(2) 를 리턴
if len(cnt) > 1:
    # 개수가 가장많은 수가 2개 이상일 경우
    if cnt[0][1] == cnt[1][1]:
        print(cnt[1][0])
    else:
        print(cnt[0][0])
else:
    print(cnt[0][0])

print(max(numList) - min(numList))

'''
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
'''
