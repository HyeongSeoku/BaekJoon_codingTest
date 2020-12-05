package JAVA.수학2;
import java.util.*;

public class Ex2581 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            //입력값: M~N까지의 수
        int M = sc.nextInt();   
        int N = sc.nextInt();   
        int min = 100000 ;

        int arr[] = new int [N+1];
        int sum = 0, sosu=0;
        for(int i=M; i<=N; ++i)
        {
            arr[i]=i;
            sosu = 0;

            //나누어 떨어지는 수의 개수가 2개이면 소수
            for(int j=1; j<=i;++j)
            {
                if(arr[i]%j == 0)
                {
                    sosu++;
                }
            }
            if(sosu == 2)
            {
                sum+= arr[i];
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }
           
        }
        
        //입력값 사이중 소수가 없을경우 
        if(sum==0)
        {
            System.out.println("-1");

        }else{
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
}