'''
    문제 이름 : 상수
    문제 번호 : 2908
    문제 링크 : https://www.acmicpc.net/problem/2908
'''

A, B = map(str, input().split())
newA = ""
newB = ""
result = []
for i in range(len(A), 0, -1):
    newA += A[i-1]
    newB += B[i-1]

result.append(int(newA))
result.append(int(newB))

print(max(result))
# [::2] 처음부터 끝까지 두칸 간격으로
# [1::2] index1부터 끝까지 두칸 간격
# [1:6:2] index1부터 index6까지 두칸 간격으로


'''
    다른 풀이
    #[::-1] 처음부터 끝까지 역순으로
    print(max(input()[::-1].split()));
'''
