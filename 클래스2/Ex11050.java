package 클래스2;
import java.util.Scanner;
public class Ex11050 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() , K = sc.nextInt();
        int result = 0;
        result = factorial(N)/(factorial(K)*factorial(N-K));
        
        System.out.println(result);
    }
    public static int factorial(int n)
    {
        if(n <= 1)
        {
            return n;
        }else{
           return factorial(n-1)*n;
        }
    }
}
