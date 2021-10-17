'''
    문제 이름 : 알파벳 찾기
    문제 번호 : 10809
    문제 링크 : https://www.acmicpc.net/problem/10809
'''
word = input()
alphabet = list(range(97, 123))  # ASCII 코드 숫자 범위
for x in alphabet:
    # find 함수 : 문자열에서 찾고있는 문자의 첫번째에 위치한 인덱스 반환 / 없을시 -1
    print(word.find(chr(x)))
