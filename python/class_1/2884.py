'''
    문제 이름 : 알람 시계
    문제 번호 : 2884
    문제 링크 : https://www.acmicpc.net/problem/2884
'''

H, M = map(int, input().split())
minusM = 45  # 상수화
newM = 0
newH = 0
# 시간이 24시간이 넘어갈 경우

# 분이 45분보다 작을 경우
if M < 45:
    newM = (60+M)-minusM
    # 시간이 0일경우
    if H < 1:
        newH = 23
    else:
        newH = H-1
else:
    newM = M-minusM
    newH = H
print(newH, newM)
