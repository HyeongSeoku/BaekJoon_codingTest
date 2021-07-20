print("연산할 두 숫자를 입력해주세요")

a, b = input().split()
print("연산자를 입력해주세요  (+ ,-,*, /)")

command = input()

if command == "+":
    print(int(a)+int(b))
elif command == "-":
    print(int(a)-int(b))
elif command == "*":
    print(int(a)*int(b))
elif command == "/":
    print(float(a)/float(b))
else:
    print("올바르지 않은 연산자 입니다!")
