'''
    문제 이름 : 마인크래프트
    문제 번호 : 18111
    문제 링크 : https://www.acmicpc.net/problem/18111
'''
#완전 탐색 문제

import sys
from collections import Counter;

read = sys.stdin.readline;

def make_land(height):
    sec =0
    for key in land:
        if key > height:
            #블록을 제거 하는 경우
            sec += (key-height) *2 *land[key]
        elif key < height:
            #블록을 더하는 경우
            sec += (height - key) * land[key]
    return sec

n,m,b = map(int,read().split());
land = [];

for _ in range(n):
    land += map(int,read().split())

_sum , _len = sum(land), n*m;
land = dict(Counter(land))
height,min_sec = 0,1000000000

for i in range(257):
    if _len *i <= _sum + b:
        sec = make_land(i)
        if sec <= min_sec:
            height = i;
            min_sec = sec;

print(min_sec,height);









'''
#시간 초과

import sys;
read = sys.stdin.readline;

n,m,b = map(int,read().split())
table = [list(map(int,read().split())) for _ in range(n)]
time,height = 999999999999,0      

for curH in range(257):
    botSum = topSum = 0    #높이 낮을때를 담을 bot , 높이가 높을때를 담을 top
    for i in range(n):
        for j in range(m):
            # 높이보다 낮으면
            if table[i][j] < curH:
                botSum += curH - table[i][j]
            #높이가 높을때
            else:
                topSum += table[i][j] - curH

    #range n의 범위를 나와서 확인해야함 !
    inventory = topSum +b
    if botSum > inventory:
        #curH일 때의 botSum이 topSum + 인벤토리의 갯수보다 클 경우 
        continue;
    #new 걸린 시간
    t = botSum + topSum*2
    #기존의 걸린 시간보다 새로운 걸린시간이 더 작거나 같을경우
    if t <= time:
        time = t    #시간 재할당
        height = curH   #높이 재할당 (curH가 0부터 257까지 증가하므로 높이가 높은 갚으로 바뀜)

print(time,height)
'''