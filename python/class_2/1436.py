'''
    문제 이름 : 영화감독 숌
    문제 번호 : 1436
    문제 링크 : https://www.acmicpc.net/problem/1436
'''

# 브루트 포스
import sys

read = sys.stdin.readline

endNum = 666
n = int(read())

cnt = 0

while True:
    # endNum에 666이 포함되있으면
    if '666' in str(endNum):
        cnt += 1  # cnt 1증가
    # cnt와 찾으려는 n번째가 같을 경우
    if cnt == n:
        print(endNum)  # endNum 출력하고 break
        break
    # 찾을때까지 endNum 1 증가
    endNum += 1
