'''
    문제 이름 : 검증수
    문제 번호 : 2475
    문제 링크 : https://www.acmicpc.net/problem/2475
'''

nums = list(map(int, input().split()))
result = 0
for i in nums:
    result += i*i

print(result % 10)
