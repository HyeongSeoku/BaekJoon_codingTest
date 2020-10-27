package 클래스3;
import java.util.Scanner;
public class Ex9095 {
    static int dp[] = new int[11];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
                //경우의 수
        dp[1] = 1;    // +1
        dp[2] = 2;    // 1+1 , +2
        dp[3] = 4;    // 1+1+1 , 1+2 , 2+1 , +3

        for(int i=4; i<11; ++i)
        {
            dp[i] = dp[i-3] + dp[i -2] + dp[i - 1];
        }
        for(int j=0; j<T; ++j)
        {
            int N = sc.nextInt();

            System.out.println(dp[N]);
        }
    }
}
