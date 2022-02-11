package 클래스1;
import java.util.Scanner;
public class Ex2439 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        sc.close();

        for(int i = 0; i<N; ++i)
        {
            for(int j= N; j>i+1; --j)
            {
                System.out.print(" ");
            }
            for(int z=0; z<i+1; ++z)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
