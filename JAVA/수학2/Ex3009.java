package 수학2;
import java.util.Scanner;

public class Ex3009 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int spot1 [] = {sc.nextInt(),sc.nextInt()};
        int spot2 [] = {sc.nextInt(),sc.nextInt()};
        int spot3 [] = {sc.nextInt(),sc.nextInt()};

        sc.close();
        
        int result [] = new int [2];
        //==========x좌표 비교=========
        if(spot1[0]==spot2[0])
        //1번째 점과 2번째 점 비교
        {
            result[0] = spot3[0];
        }
        else if(spot1[0]==spot3[0])
        //1번째 점과 3번째 점 비교
        {
            result[0] = spot2[0];
        }else{
            //2번째 점과 3번째 점
            result[0] = spot1[0];
        }

        //=======y좌표 비교===========
        if(spot1[1]==spot2[1])
        //1번째 점과 2번째 점 비교
        {
            result[1] = spot3[1];
        }
        else if(spot1[1]==spot3[1])
        //1번째 점과 3번째 점 비교
        {
            result[1] = spot2[1];
        }else{
            //2번째 점과 3번째 점
            result[1] = spot1[1];
        }
        System.out.println(result[0]+" "+result[1]);
    }    
}
