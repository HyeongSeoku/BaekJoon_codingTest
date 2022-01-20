'''
    문제 이름 : 키로거
    문제 번호 : 5397
    문제 링크 : https://www.acmicpc.net/problem/5397
'''
import sys
read = sys.stdin.readline

N = int(read())

for _ in range(N):
    typing = read().strip()
    left, right = [], []  # 왼쪽,오른쪽
    for typ in typing:
        # 왼쪽 화살표
        if typ == "<":
            if left:
                # 왼쪽 리스트가 비어있지 않다면,
                right.append(left.pop())
        # 오른쪽 화살표
        elif typ == ">":
            # 오른쪽 리스트가 비어있지 않다면,
            if right:
                left.append(right.pop())
        # 백 스페이스
        elif typ == "-":
            # 왼쪽 리스트가 비어있지 않다면
            if left:
                left.pop()
        # 문자일 경우
        else:
            left.append(typ)
    # 왼쪽 리스트에 오른쪽 리스트를 붙임
    left.extend(reversed(right))  # 역순으로 넣어야함
    print(''.join(left))  # 리스트의 값을 모두 붙여서 출력


# 리스트를 두개 활용하는것을 생각을 못했음
