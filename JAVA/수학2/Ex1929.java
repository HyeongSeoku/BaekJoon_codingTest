package 수학2;
import java.util.Scanner;
public class Ex1929 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int M =sc.nextInt();
        int N =sc.nextInt();
        int arr [] = new int [N+1];
        for(int i=M; i<=N; ++i)
        {
            arr[i]=i;
            int sosu = 0;
            for(int j=1; j<=i; ++j)
            {
                if(arr[i] % j ==0)
                {
                    sosu++;
                }
            }
                if(sosu == 2)
                {
                    System.out.println(arr[i]);
                }
        }

    }
}