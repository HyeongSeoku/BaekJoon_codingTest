'''
    문제 이름 : 두수 비교하기
    문제 번호 : 1157
    문제 링크 : https://www.acmicpc.net/problem/1330
'''

a,b = map(int,input().split());

if a>b:
    print(">");
elif a<b :
    print("<");
else:
    print("==");

