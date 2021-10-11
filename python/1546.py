'''
    문제 이름 : 평균
    문제 번호 : 1546
    문제 링크 : https://www.acmicpc.net/problem/1546
'''

N = int(input());
result = [];
score = list(map(int,input().split())); #set(map()) 써서 틀렸음

maxScore = max(score);

for i in score:
    result.append(i/maxScore*100);
test_avg = sum(result)/N;
print(test_avg);
