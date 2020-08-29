package 수학1;
import java.util.Scanner;

public class Ex2869 {
    public static void main(String args[])
    {
        //높이 V 달팽이 A미터 낮 올라감 밤에 B미터 미끄러짐
        // 정상에 오른후는 미끄러지지 않음
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int A =sc.nextInt();
        int B =sc.nextInt();
        sc.close();
        //===========입력문==========
        int count = 0;  //걸리는 날짜
        int sum =0 ;  
        while(true)
        {
            //높이에 도달할 경우
            if(sum==V)
            {
                System.out.println(count);
            }
            //
            else{
                count++;
                sum = count*(A-B);
            }
        }

    }
}