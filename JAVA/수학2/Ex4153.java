package 수학2;
import java.util.Scanner;
public class Ex4153 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            //0,0,0 입력시 루프 탈출
            if(x==0 && y==0 && z==0)
            {
                break;
            }

           //피타고라스의 정의 사용
            if(x*x==y*y+z*z)
            //x가 최대값 일경우
            {
                System.out.println("right");
            }else if(y*y==x*x+z*z)
            //y가 최대값 일경우
            {
                System.out.println("right");
            }else if(z*z==x*x+y*y)
            //x가 최대값 일경우
            {
                System.out.println("right");
            }else{
                //피타고라스 정의에 어긋날 경우
                System.out.println("wrong");
            }
        }
    }
   
}
