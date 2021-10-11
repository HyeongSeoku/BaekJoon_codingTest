'''
    문제 이름 : 별 찍기
    문제 번호 : 2438
    문제 링크 : https://www.acmicpc.net/problem/2438
'''

N = int(input())

for i in range(1, N+1):  # 0일때도 생각해야함 range(1:N)으로 설정해야함
    print('*'*i)
