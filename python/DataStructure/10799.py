'''
    문제 이름 : 쇠막대기
    문제 번호 : 10799
    문제 링크 : https://www.acmicpc.net/problem/10799
'''

# # () = 레이저 ,
# ( = 쇠막대기 시작
# ) = 쇠막대기 끝
import sys
read = sys.stdin.readline

# 문자를 한글자씩 저장하고 싶으면 list로 Casting
str_target = list(read().rstrip())
razor_bar = []
answer = 0

for i in range(len(str_target)):
    if str_target[i] == "(":
        # 여는 태그일 경우 추가
        razor_bar.append(str_target[i])
    else:
        # 닫는 태그일 경우
        # isRazor = razor_bar.pop()       # 오답 이유
        if str_target[i-1] == "(":
            # 레이저인 경우
            razor_bar.pop()
            answer += len(razor_bar)
        else:
            # 쇠막대기의 끝일 경우
            razor_bar.pop()  # 쇠막대기 하나 빼줌
            answer += 1


print(answer)
