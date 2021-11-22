'''
    문제 이름 : 구구단
    문제 번호 : 2739
    문제 링크 : https://www.acmicpc.net/problem/2739
'''

N = int(input())

for i in range(1, 10):
    print(N, "*", i, "=", N*i)
