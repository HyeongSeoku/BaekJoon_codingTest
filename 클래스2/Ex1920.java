package 클래스2;
import java.util.Scanner;
public class Ex1920 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr_N[] = new int[N];
        for(int i =0; i<N; ++i)
        {
            arr_N[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int arr_M[] = new int [M];
        for(int i =0; i<M; ++i)
        {
            arr_M[i] = sc.nextInt(); 
        }
        for(int i=0; i<M; ++i)
        {
            boolean check = false;
            for(int j =0; j<N; j++)
            {
                if(arr_M[i]==arr_N[j])
                {
                    check = true;
                }
            }
            if(check)
            {
                System.out.println("1");
            }
            else
            System.out.println("0");
        }
    
    }
}
