package 수학1;
import java.util.Scanner;
public class Ex2775 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        int APT[][] = new int[15][15];     // 층 : 1<= K <=14  호: 1<= N <=14
        
        for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	        // i층 1호
			APT[0][i] = i;	        // 0층 i호
        }
        
        for(int i=1; i<15; ++i)
        {
            for(int j=2; j<15; ++j)
            {
                APT[i][j] = APT[i][j-1]+APT[i-1][j];
            }
        }

        //==========================================
        int T = sc.nextInt();
        for(int i=0; i<T; ++i)
        {
            int K = sc.nextInt();
            int N = sc.nextInt();
        
            System.out.println(APT[K][N]);
        }
        sc.close();
        //==========입력부=======================
    }
}