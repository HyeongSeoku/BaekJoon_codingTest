package 클래스3;
import java.util.Scanner;
public class Ex1003 {
        static int zeroCnt;
        static int oneCnt;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int arr[] = new int[T*2];//짝수칸에 0 호출 횟수, 홀수칸에 1 호출횟수 넣어주기위해
  
        for(int i=0;i<T;++i)
        {
            zeroCnt = 0;
            oneCnt = 0;
            int N = sc.nextInt();

            Fibonacci(N);

            arr[i*2] = zeroCnt;
            arr[i*2+1] = oneCnt;
        }

        for(int j=0; j<T; ++j)
        {
            System.out.println(arr[j*2]+" "+arr[j*2+1]);
        }
        sc.close();
    }
    private static int Fibonacci(int n)
    {
        
        if(n==0)
        {
            zeroCnt++;
            return n ;
        }
        else if(n ==1)
        {
            oneCnt++;
            return n;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    
}
