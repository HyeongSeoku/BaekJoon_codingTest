package 함수;
import java.util.Scanner;

public class Ex1065 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        if(N<100)
        {
            System.out.println(N);
        }else
        {
            result = 99 ;
            for(int i=100;i<=N;++i)
            {
                result+=checkHanNumber(i);
            }
            
            System.out.println(result);
        }
    }
    private static int checkHanNumber(int number)
    {
        int num1 = number / 100 %10;  //1의자리
        int num2 = number / 10 %10;   //10의자리
        int num3 = number % 10;       //100의자리

        if(num2*2==num1+num3)
        {
            return 1;
        }
            return 0;
    }                   
}