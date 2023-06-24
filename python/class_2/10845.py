'''
    문제 이름 : 큐
    문제 번호 : 10845
    문제 링크 : https://www.acmicpc.net/problem/10845
'''

import sys
read = sys.stdin.readline


n = int(read())
queue = []

for i in range(n):
    command = read().split()
    operator = command[0]

    if operator == 'push':
        queue.append(command[1])
    elif operator == 'pop':
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.pop(0))
    elif operator == 'size':
        print(len(queue))
    elif operator == 'empty':
        print(int(len(queue) == 0))
    elif operator == 'front':
        if (len(queue) == 0):
            print(-1)
        else:
            print(queue[0])
    else:
        if (len(queue) == 0):
            print(-1)
        else:
            print(queue[-1])
