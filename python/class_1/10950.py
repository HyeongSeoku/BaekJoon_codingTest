'''
    문제 이름 : A + B - 3
    문제 번호 : 10950
    문제 링크 : https://www.acmicpc.net/problem/10950
'''

import sys

read = sys.stdin.readline

N = int(read())

for i in range(N):
    nums = list(map(int, read().split()))
    print(nums[0]+nums[1])
