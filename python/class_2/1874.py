'''
    문제 이름 : 스택 수열
    문제 번호 : 1874
    문제 링크 : https://www.acmicpc.net/problem/1874
'''

import sys

read = sys.stdin.readline

N = int(read())
list = list(range(1, N + 1))
stack = []
answer = []

impossible = False

for i in range(N):
    if impossible:
        exit(0)

    target = int(read())
    push_count_list = []
    slice_list = []

    if target not in stack:
        if target not in list:
            print("NO")
            exit(0)
        slice_list = list[:list.index(target) + 1]
        list = list[list.index(target) + 1:]
        push_count_list = ["+" for _ in range(len(slice_list))]

    answer.extend(push_count_list)
    stack.extend(slice_list)

    while True:
        cur_stack_ele = stack.pop()
        answer.append("-")

        if cur_stack_ele == target:
            break

        if len(stack) == 0:
            impossible = True
            print("NO")
            break

for i in answer:
    print(i)


# target = int(read())
# print(list[:list.index(target)]+1)
