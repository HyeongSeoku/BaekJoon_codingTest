'''
    문제 이름 : A + B -5
    문제 번호 : 10952
    문제 링크 : https://www.acmicpc.net/problem/10952
'''

while True:
    a, b = map(int, input().split())
    if a==0 and b == 0:
        break;
    print(a+b)

'''
#숏코딩
while a:=sum(map(int,input().split())):print(a)
'''