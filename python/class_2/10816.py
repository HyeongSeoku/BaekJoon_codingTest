'''
    문제 이름 : 숫자 카드 2
    문제 번호 : 10816
    문제 링크 : https://www.acmicpc.net/problem/10816
'''
import sys;

read = sys.stdin.readline;

n = int(read())

for i in range(n):
    cardList = list(map(int,read().rstrip().split()))

m = int(read())

for _ in range(m):
    targetList = list(map(int,read().rstrip().split()))

print(cardList,targetList)
# for target in targetList:
    
#     count = 0
#     for card in cardList:
#         if target == card:
#             count +=1;
#         print(count)