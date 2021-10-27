'''
    문제 이름 : Hashing
    문제 번호 : 15829
    문제 링크 : https://www.acmicpc.net/problem/15829
'''
import sys;
read = sys.stdin.readline;

L = int(read());
string = read();
answer = 0;

#모두 소문자로 구성되어 있으므로 -96
for i in range(L):
    answer += ((ord(string[i]) -96)*(31**i));

print(answer % 1234567891);


