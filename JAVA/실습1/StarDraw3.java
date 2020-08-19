package 실습1;
import java.util.Scanner;

public class StarDraw3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1;i<=2*num;i++)
        {
            //홀수 행
            if(i%2==1)
            {
                for(int j=i;j<=num;j++)
                {
                    if(j%2==1)  //홀수 번째
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            //짝수 행
            if(i%2==0)
            {
                for(int j=i;j<=num;j++)
                {
                    if(j%2==1)  //홀수 번째
                    {
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
           
        }
        sc.close();
    }
}