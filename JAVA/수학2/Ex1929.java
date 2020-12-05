package JAVA.수학2;
import java.util.Scanner;
public class Ex1929 {
    public static boolean[] prime;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt() , N = sc.nextInt();

        prime = new boolean[N+1];
        get_prime();

        for(int i=M; i<=N;++i)
        {
            if(!prime[i])
            System.out.println(i);
        }

        
    }
    public static void get_prime(){
        //true = 소수 아님 , false = 소수
         
        prime[0] = prime[1] = true;
        for(int i=2; i<=Math.sqrt(prime.length); ++i)
        {
            if(prime[i]) continue;
            for(int j=i*i; j<prime.length; j+=i)
            {
                //배수들은 소수가 아님.
                prime[j] = true;
            }
        }
    }
}