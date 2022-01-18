'''
    문제 이름 : 괄호의 값
    문제 번호 : 2504
    문제 링크 : https://www.acmicpc.net/problem/2504
'''

import sys
read = sys.stdin.readline

brackets = list(read().rstrip())  # 입력받은 괄호들

stack = []
tmp = 1
answer = 0

for i in range(len(brackets)):
    # 열린 괄호 ( 일때
    if brackets[i] == "(":
        stack.append(brackets[i])
        tmp *= 2
    # 열린 괄호 [ 일때
    elif brackets[i] == "[":
        stack.append(brackets[i])
        tmp *= 3
    # 닫힌 괄호 ) 일때
    elif brackets[i] == ")":
        # 스택이 비어있거나 , 스택의 마지막 원소가 ( 아닐경우
        if not stack or stack[-1] != "(":
            answer = 0  # 정답 값 0으로 초기화
            break
        # 바로 직전이 ( 일 경우 즉 , 추가적으로 곱할 필요가 없는 경우
        if brackets[i - 1] == "(":
            answer += tmp
        stack.pop()
        tmp //= 2
    else:
        # 스택이 비어있거나 , 스택의 마지막 원소가 ( 아닐경우
        if not stack or stack[-1] != "[":
            answer = 0  # 정답 값 0으로 초기화
            break
        if brackets[i-1] == "[":
            answer += tmp
        stack.pop()
        tmp //= 3

if stack:
    print(0)
else:
    print(answer)


'''
열린 괄호 ( , [ 이면 일단 스택에 넣음
if 닫힌 괄호
    if )
        스택 팝 한것이 ( 일경우 default * 2

    elif ]
        스택 팝 한것이 [ 일경우 default * 3

스택 비어있을 경우 = 이제까지 더해진것 계산후 더하고 default 1로 초기화

닫힌 괄호 이후에 바로 열린 괄호일 경우 = result + tmpSum

'''
