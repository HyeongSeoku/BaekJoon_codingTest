'''
    문제 이름 : 나머지
    문제 번호 : 3052
    문제 링크 : https://www.acmicpc.net/problem/3052
'''
arr = []
for i in range(10):
    num = (int(input()) % 42)
    arr.append(num)

arr = set(arr)

print(len(arr))
