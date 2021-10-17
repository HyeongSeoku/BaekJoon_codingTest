'''
    문제 이름 : A + B -4
    문제 번호 : 10951
    문제 링크 : https://www.acmicpc.net/problem/10951
'''

while True:
    try:
        a, b = map(int, input().split())
        print(a+b)
    except:
        print("error")  # 이 내용 없어야 맞음
        break

# 예외 처리 사용
