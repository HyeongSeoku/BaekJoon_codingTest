'''
    문제 이름 : 윤년
    문제 번호 : 2753
    문제 링크 : https://www.acmicpc.net/problem/2753
'''

year = int(input());

if year % 4 ==0 and (year % 100 != 0 or year%400==0) :
    print(1);
else :
    print(0);