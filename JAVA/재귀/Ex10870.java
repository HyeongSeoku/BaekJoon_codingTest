package JAVA.재귀;
import java.util.Scanner;

public class Ex10870 {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        sc.close();

        result=+fibonacci(N);   //Fibonacci함수 리턴값 결과에 저장

        System.out.println(result);
        
    }
    private static int fibonacci(int n)
    {
        if(n<=1)
            return n;
        else
            return fibonacci(n-2)+fibonacci(n-1);
    }
    
}