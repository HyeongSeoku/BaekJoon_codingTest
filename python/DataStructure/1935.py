'''
    문제 이름 : 후위 표기식2
    문제 번호 : 1935
    문제 링크 : https://www.acmicpc.net/problem/1935
'''

import sys
read = sys.stdin.readline

N = int(read())  # 피연산자의 개수
sen = read().rstrip()    # 후위 표기식      ❗️ 마지막 공백때문에 틀림
nums = [int(read()) for _ in range(N)]  # 알파벳과 대응되는 값

stack = []  # 피연산자를 담을 스택

for i in sen:
    # 피연산자인 경우
    if 'A' <= i <= 'Z':
        stack.append(nums[ord(i)-ord('A')])  # 스택에 피연산자 넣음 (숫자로 변환)
    # 연산자인 경우
    else:
        # 순서 지켜줘야 하기 때문에 역순으로 대입
        str2 = stack.pop()
        str1 = stack.pop()

        # ❗️ 연산후 다시 넣어주어야 하는거 잊지 말기
        if i == "+":
            stack.append(str1 + str2)
        elif i == "-":
            stack.append(str1 - str2)
        elif i == "*":
            stack.append(str1 * str2)
        elif i == "/":
            stack.append(str1 / str2)

# 소수점 두자리 까지 출력
print(f"{stack[0]:.2f}")  # 마지막 남아있는 수 = 정답
