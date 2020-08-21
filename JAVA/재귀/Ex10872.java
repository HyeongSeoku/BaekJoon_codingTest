package 재귀;
import java.util.Scanner;
public class Ex10872 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = factorial(N);
        System.out.println(result);
    }
    private static int factorial(int n)
    {
       
        if(n<=1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}