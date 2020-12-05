package JAVA.수학1;
import java.util.Scanner;
public class Ex10250 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   //테스트 케이스 개수
        
        for(int i=0;i<T;++i)
        {
            int H = sc.nextInt();   //층수 
            int W = sc.nextInt();   //방수
            int N = sc.nextInt();   //몇번째 손님

            //========입력문=============
            


            //N%H == 0 일경우에만 예외가 발생.
            if(N%H == 0)
            {
                System.out.println(H*100+(N/H));
                
            }
            else
            {
                System.out.println((N%H)*100 + (N/H+1));
            }
            
        }
        sc.close();     //for문 안에 둘시 입력이 남았는데 스캐너 닫아버림.
    }
}