package 클래스2;
import java.util.Arrays;
import java.util.Scanner;
public class Ex10816 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //카드의 개수
        int card[] = new int[N];
        
        for(int i=0; i<N; ++i)
        {
            card[i]=sc.nextInt();
        }
        int M =sc.nextInt();
        int num[]= new int[M];  //구해야할 M개의 정수
        for(int j=0; j<M; ++j)
        {
            num[j] = sc.nextInt();
        }
        Arrays.sort(card);
        Arrays.sort(num);

    }
    public static int Binary(int n[], int m[])
    {
        for(int i=0;i<N; ++i)
        {
            
        }
    }
}
