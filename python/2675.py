'''
    문제 이름 : 문자열 반복
    문제 번호 : 2675
    문제 링크 : https://www.acmicpc.net/problem/2675
'''

testCase = int(input())
for i in range(testCase):
    repeat, S = input().split()
    text = ""
    for j in S:
        text += j*int(repeat)
    print(text)
