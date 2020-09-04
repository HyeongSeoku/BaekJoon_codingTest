package 수학1;
import java.util.Scanner;
public class Ex1011 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i =0; i<T; ++i)
        {
            int x = sc.nextInt() , y = sc.nextInt();
            if(x>y) break ;         //x값이 y보다 클경우 종료 
            int Dist = y-x ;
            int max =(int) Math.sqrt(Dist);         //max 값은 거리값의 제곱근의 정수부분

            if(max == Math.sqrt(Dist))
            //max 값이 변할 때 카운트 값
            {
                System.out.println(2*max -1);
            }else if(Dist<=max*max+max)
            //count가 변하는 구간 (첫번째 묶음)
            {
                System.out.println(2*max);
            }else
            //max가 변하기 직전까지의 구간(두번째 묶음)
            {
                System.out.println(2*max +1);
            }
        }
        sc.close();
    }
    
}
/*
 max = Math.sqrt((int)distance);
        
        if(max = Math.sqrt(distance))   //max가 변할때
        {
            count = 2*max-1;
        }
        else if(distance<=max*max+max)  //count가 변하는 구간 첫번째 묶음
        {
            count = 2*max;
        }else                           //max가 변하기 직전까지의 구간(두번째 묶음)
        {
            count = 2*max +1;
        }
*/