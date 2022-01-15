'''
    문제 이름 : 괄호의 값
    문제 번호 : 2504
    문제 링크 : https://www.acmicpc.net/problem/2504
'''

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

import sys
read = sys.stdin.readline

brackets = list(read().rstrip())  # 입력받은 괄호들

stack = []
tmpSum = 1  # 열린 괄호들을 계산할 중간 tmpSum
result = 0  # 총합이 담길 result

for i in range(len(brackets)):
    if brackets[i] == "(" or brackets[i] == "[":
        if brackets[i-1] == ')' or brackets[i-1] == "]":
            stack.append(brackets[i])
            result += tmpSum
            tmpSum = 1
        # 열린 괄호일 경우 스택에 append
        else:
            stack.append(brackets[i])
    else:
        # 닫힌 괄호일 경우
        if brackets[i] == ")" and stack[-1] == "(":
            # )이고 스택의 마지막이 ( 일경우
            tmpSum *= 2
            stack.pop()

        elif brackets[i] == "]" and stack[-1] == "[":
            # ]이고 스택의 마지막이 [ 일경우
            tmpSum *= 3
            stack.pop()
        else:
            # 짝이 안 맞는 경우
            print(0)
            exit(0)
    if len(stack) == 0:
        result += tmpSum
        tmpSum = 1


print(result)

# 런타임 오류가 뜨는 이유는 ??
