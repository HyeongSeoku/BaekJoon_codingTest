package JAVA.브루트포스;

import java.util.Scanner;

public class Ex2231 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int range = String.valueOf(N).length();     //N의 자리수
        int min = N - (9*range);        //최소 범위 설정
        int result = 0;

        //최소값 부터 N보다 작은수까지 모든수 검사 
        for(int i=min; i<N; ++i)
        {
            int sum = i;        //합 
            int x = i;          //끊기위해

            while(x>0)
            {
                sum += x%10 ;   //1의자리 더함 
                x /= 10 ;       //10으로 나눔
            }

            if(sum == N)
            {
                result = i ;
                break;
            }
            
        }
        System.out.println(result);
       
    }
    
}
