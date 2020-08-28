package 수학1;
import java.util.Scanner;
public class Ex1193 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        //=====입력문========
        int cross_cnt = 1 ,pre_cnt_sum =0;
      while(true)
      {
       
        //대각선 수 + 이전 대각선 수가 입력값보다 크거나 같을때
        if(N <= cross_cnt+pre_cnt_sum)
        {   
            
            //짝수일때
            if(cross_cnt%2== 0)
            {                                                //  ↓ 0이됨 
                //분자: N-이전 대각선 합 , 분모 : 대각선 수 -(N - 이전대각선 합 -1)
                System.out.print((N-pre_cnt_sum)+ "/" +(cross_cnt-(N-pre_cnt_sum-1)));
                break;
            }
            
            //홀수일때
            else
            {   
                //짝수일때 와 반대로 출력
                System.out.print((cross_cnt-(N-pre_cnt_sum-1))+ "/" +(N-pre_cnt_sum));
                break;
            }
        }
        else
        {
            pre_cnt_sum += cross_cnt;
            cross_cnt++;
        }
    
       }  
       
    }
    
}
