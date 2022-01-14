'''
    문제 이름 : 좋은 단어
    문제 번호 : 3986
    문제 링크 : https://www.acmicpc.net/problem/3986
'''

import sys
read = sys.stdin.readline

N = int(read())
words = [read().rstrip() for _ in range(N)]  # 단어 저장
cnt = 0  # 좋은 단어의 개수

# 단어 하나씩 탐색
for word in words:
    # 단어의 글자 하나씩 탐색
    stack = []  # 좋은 단어 후보
    for i in range(len(word)):
        # 현재 단어와 스택에 마지막으로 들어간 단어가 같을 경우
        if stack and word[i] == stack[-1]:
            # 스택에서 삭제
            stack.pop()
        else:
            stack.append(word[i])
    # 단어 하나를 다 돌았을때 스택이 비어있으면 좋은 단어 +1
    if not stack:
        cnt += 1

print(cnt)


# ❗️ 단어 내에서 비교해야 하는것을 모르고 다른 단어내에서 해당 글자가 있냐를 판단하려해서 생긴 오류
