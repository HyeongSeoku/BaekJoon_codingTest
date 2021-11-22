'''
    문제 이름 : 시험 성적
    문제 번호 : 9498
    문제 링크 : https://www.acmicpc.net/problem/9498
'''
a=int(input())

if a>=90 :
    print("A")
elif 89>= a>=80 :
    print("B")
elif 79>= a>=70 :
    print("C")
elif 69>= a>=60 :
    print("D")
else:
    print("F")

