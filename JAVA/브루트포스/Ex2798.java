package JAVA.브루트포스;
import java.util.Scanner;

public class Ex2798 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int cards [] = new int [N];
        for(int i=0;i<N;++i)
        {
            cards[i] = sc.nextInt();
        }
        sc.close();
        //============입력부===================
        int result = blackjack(cards, N, M);
        System.out.println(result);
    }
    static int blackjack(int[] arr,int n, int m)
    {
        int result = 0;
        //3장을 고르기 때문에 첫번째 카드 n-2까지만 순회
        for(int i=0;i<n-2;++i)
        {
            //두번째 카드는 첫번째 카드 다음부터 n-1까지 순회
            for(int j=i+1;j<n-1;++j)
            {
                //세번째 카드는 두번째 카드 다음부터 n까지 순회
                for(int k=j+1;k<n;++k)
                {
                    int temp = arr[i]+arr[j]+arr[k];

                    if(m==temp)
                    {
                        return temp;
                    }

                    if(result<temp && temp<m){
                        result = temp;
                    }
                }
            }
        
        }
        return result;
    }
}