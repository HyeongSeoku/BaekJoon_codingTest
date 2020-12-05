package JAVA.수학2;
import java.util.Scanner;
public class Ex4948 {

    public static boolean[] prime = new boolean [246913];
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        get_prime();        //소수 얻는 메소드 실행

        while(true)
        {
            
            int N = sc.nextInt();
            if(N == 0) break;
            
            int count = 0;      //소수의 개수를 세줄 변수
            
            
            for(int i=N+1; i<=N*2; ++i)
            {
                if(!prime[i]) count++;
            }
            System.out.println(count);
        
        }

    }

    //에라토스테네스의 체
    public static void get_prime(){
        //true = 소수아님 , false = 소수
        prime[0] = prime[1] = true ;
        
        for(int i =2; i<=Math.sqrt(prime.length); ++i)
        {
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i)
            {
                prime[j] = true;
            }
        }
    }
}