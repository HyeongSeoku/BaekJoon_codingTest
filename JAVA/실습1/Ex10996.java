package 실습1;
import java.util.Scanner;

public class Ex10996 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력 받는수

        for(int i=1;i<=N*2;++i)
        {
            if(i%2==1)      //홀수행
            {
                for(int j=1;j<=N;++j)
                {
                    if(j%2==1)
                    {
                        System.out.print("*");
                    }else
                        System.out.print(" ");
                }
                    
            }
            else        //짝수행
            {
                for(int j=1;j<=N;++j)
                {
                    if(j%2==1)
                    {
                        System.out.print(" ");
                    }else
                        System.out.print("*");
                }
            }
            System.out.print("\n");       
        }
    }
}
