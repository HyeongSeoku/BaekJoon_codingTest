package JAVA.수학1;
import java.util.Scanner;

public class Ex2839 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        while(N>0)
        {
             if(N%5==0)
             {
                 System.out.println(N/5);
                 return ;
             }
             else
             {
                int share = N/5;
                for(int i=share;i>0;--i)
                {
                    int tmp = N-(i*5);
                    if(tmp%3==0)
                    {
                        System.out.println(i+(tmp/3));
                        return;
                    }
                }

             }
             if(N%3==0)
             {
                 System.out.println(N/3);
             }else{
                 System.out.println(-1);
             }
             return;
        }
        
    }    
}