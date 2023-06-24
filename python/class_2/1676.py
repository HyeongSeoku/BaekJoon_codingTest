'''
    문제 이름 : 팩토리얼 0의 개수
    문제 번호 : 1676
    문제 링크 : https://www.acmicpc.net/problem/1676
'''

'''
    N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

    팩토리얼 구한뒤 뒤에서부터 0이 아닌 숫자가 나올때까지 0의 개수를 카운트
'''

import sys
read = sys.stdin.readline

N = int(read())
result = 1
cnt = 0

for i in reversed(range(1, N + 1)):
    result *= i

for i in reversed(str(result)):
    if (i == '0'):
        cnt += 1
        continue
    break

print(cnt)
