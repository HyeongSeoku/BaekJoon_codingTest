package JAVA.실습1;
import java.util.Scanner;

public class StarDraw {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //스캐너 생성

        int num =sc.nextInt(); //입력 받을 변수

        for(int i=1;i<=num;i++)     //이중for문 사용(입력값까지 증가)
        {  
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
               

        for(int i=num-1;i>0;i--)    //이중for문 사용(입력값부터 1까지 감소)
        {
            for(int j =0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
        sc.close();
    }
    
}