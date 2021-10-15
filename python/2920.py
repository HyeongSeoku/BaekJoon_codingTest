'''
    문제 이름 : 음계
    문제 번호 : 2920
    문제 링크 : https://www.acmicpc.net/problem/2920
'''

'''
nList = list(map(int, input().split()))

if nList == sorted(nList):
    print("ascending")
elif nList == sorted(nList, reverse=True):
    print("descending")
else:
    print("mixed")
'''

a = input()[2::2]  # 공백때문에 index2 부터 2칸씩 띄어서
print({a: "mixed", "2345678": "ascending", "7654321": "descending"}[a])
