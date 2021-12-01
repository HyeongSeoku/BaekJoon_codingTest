'''
    문제 이름 : 마인크래프트
    문제 번호 : 18111
    문제 링크 : https://www.acmicpc.net/problem/18111
'''

import sys;
read = sys.stdin.readline;

n,m,b = map(int,read().split());
#리스트에 삽입 n번 반복
table = [list(map(int,read().split())) for _ in range(n)]
time,height = 9223372036854775807,0     #시간을 이렇게 설정해주는 이유는 ? 
#모든 높이를 돌면서
for curH in range(257):
    bot = top = 0       #높이 낮을때를 담을 bot , 높이가 높을때를 담을 top
    for i in range(n):
        for j in range(m):
            # 높이보다 낮으면
            if table[i][j] < curH:
                bot += curH - table[i][j]      #bot = 현재높이 - 테이블에 입력된 높이
            # 높이보다 높을 경우
            else:
                top += table[i][j] - curH   # top = 테이블 높이 - 현재 높이
    
    if bot > top + b:
        continue;
    t = bot + top *2
    #걸린 시간이 이전에 저장된 시간보다 작거나 같을경우
    if t <= time:
        time = t        #재할당
        height = curH   #높이 재할당
print(time,height)


'''
    완전 탐색 문제
'''