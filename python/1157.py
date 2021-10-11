'''
    문제 이름 : 단어 공부
    문제 번호 : 1157번
    문제 링크 : https://www.acmicpc.net/problem/1157
'''

word = input().upper();
word_list = list(set(word));
cnt = [];

for i in word_list:
    each_cnt = word.count(i);       #i가 몇갠지 카운트
    cnt.append(each_cnt);           #cnt의 i번째에 word_list i번째의 알파벳의 갯수 들어가 있음

if cnt.count(max(cnt)) >=2 :       #카운트의 최대값이 두개이상 있을 경우
    print("?");
else :
    print(word_list[(cnt.index(max(cnt)))]);


