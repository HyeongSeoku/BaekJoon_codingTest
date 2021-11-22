'''
    문제 이름 : X보다 작은 수
    문제 번호 : 10871
    문제 링크 : https://www.acmicpc.net/problem/10871
'''

import sys

read = sys.stdin.readline
N, X = map(int, read().split())

nums = list(map(int, read().split()))

for num in nums:
    if num < X:
        print(num, end=" ")
