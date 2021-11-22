'''
    문제 이름 : 별 찍기 -2
    문제 번호 : 2439
    문제 링크 : https://www.acmicpc.net/problem/2439
'''
N = int(input())

for i in range(1, N+1):  # 0일때도 생각해야함 range(1:N)으로 설정해야함
    print(' '*(N-i) + '*'*i)
    #    print((' '*N-i) +('*'*i)) 라고 써서 틀림
