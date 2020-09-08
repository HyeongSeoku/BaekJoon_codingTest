package 수학2;
import java.util.Scanner;

public class Ex9020 {
   public static boolean [] prime = new boolean[10001];
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        get_prime();        //에라토스테네스의 체

        int T = sc.nextInt();
        
        while(T-->0)                    //T부터 0까지
        {
            int n = sc.nextInt();

            //두 수를 반으로 나눠서 각각 변수에 초기화 시켜줌
            int firstDecimal = n/2;     
            int secondDecimal = n/2;

            while(true)
            {
                //첫번째 수와 두번째수 모두 소수인 경우
                if(!prime[firstDecimal] && !prime[secondDecimal])           
                {
                    System.out.println(firstDecimal+" "+secondDecimal);
                    //break 빼먹지 말것.
                    break;
                }
                firstDecimal--;     //첫번째 수 감소
                secondDecimal++;    //두번째 수 증가
            }
            
        }


        
    }

    //에라토스테네스의 체
    public static void get_prime(){
        prime[0] = prime[1] =true;

        for(int i=2; i<Math.sqrt(prime.length); ++i)
        {
            if(prime[i])continue;
            for(int j=i*i; j<prime.length;j+=i)
            {
                prime[j]=true;
            }

        }
    }
}
