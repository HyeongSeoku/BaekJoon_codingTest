'''
    문제 이름 : 최댓값
    문제 번호 : 2562
    문제 링크 : https://www.acmicpc.net/problem/2562
'''
num = []

for i in range(9):
    i = input()
    num.append(int(i))

maxN = max(num)
idx = num.index(maxN)  # index 함수 : 위치 반환 (0부터 시작)

print(maxN)
print(idx+1)
