package 문자열;
import java.util.Scanner;

public class Ex2908 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
       
         
        num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());    //Integer.pareseInt로 다시 인트형으로 변환
        num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());

        System.out.print(num1>num2 ? num1:num2); // 3항 연산자

        //StringBuilder() = 문자열 다루는 클래스 아래의 것들 포함
        
         //reverse()      = 문자열 뒤집는 메소드
         //append()       = 문자열을 붙이는 메소드
         //toString()     = 객체를 문자로 표현하는 메소드
    }
}