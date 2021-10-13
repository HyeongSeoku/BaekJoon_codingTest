'''
    문제 이름 : 숫자의 개수
    문제 번호 : 2577
    문제 링크 : https://www.acmicpc.net/problem/2577
'''

a = int(input())
b = int(input())
c = int(input())

result = list(str(a*b*c))  # a*b*c를 문자열로 변환후 각각의 문자를 요소로 가지는 list로 저장

for i in range(10):  # 0~9까지
    print(result.count(str(i)))
