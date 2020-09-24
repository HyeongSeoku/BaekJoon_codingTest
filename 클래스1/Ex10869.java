package 클래스1;
import java.util.Scanner;
public class Ex10869 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt() ,num2 =sc.nextInt();

        System.out.println(num1+num2);  //덧셈
        System.out.println(num1-num2);  //뺄셈
        System.out.println(num1*num2);  //곱셈
        System.out.println(num1/num2);  //몫
        System.out.println(num1%num2);  //나머지 
    }
}
