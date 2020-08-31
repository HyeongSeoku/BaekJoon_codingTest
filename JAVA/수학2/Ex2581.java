package 수학2;
import java.util.*;

public class Ex2581 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int arr[] = new int [N+1];
        int sum = 0, sosu=0;
        for(int i=M; i<=N; ++i)
        {
            arr[i]=i;
            sosu = 0;
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
                Arrays.sort(arr,M,N);
            }
        }
        System.out.println(sum);
        System.out.println(arr[M]);
    }
}