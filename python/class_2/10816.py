'''
    문제 이름 : 숫자 카드 2
    문제 번호 : 10816
    문제 링크 : https://www.acmicpc.net/problem/10816
'''
import sys

read = sys.stdin.readline

n = int(read())
cardList = list(map(int, read().split(" ")))

dict1 = dict()

for i in cardList:
    count = 0
    if i in dict1:
        # 해당 카드가 있으면 증가
        dict1[i] += 1
        # 해당 카드 없으면 체크
    else:
        dict1[i] = 1

m = int(read())
targetList = list(map(int, read().split(" ")))

for i in targetList:
    if i in dict1:
        print(dict1[i], end=" ")
    else:
        print(0, end=" ")
