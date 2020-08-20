package 문자열;
import java.util.Scanner;
public class Ex2675 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0;i<N;++i)
        {
            int rotate = sc.nextInt();
            String str = sc.next();
            sc.close();
            for(int j=0;j<str.length();++j)
            {
                for(int z=0;z<rotate;++z)       //rotate번 반복
                {
                    System.out.print(str.charAt(j));  //A.charAt(i) ==A의 i번째 인덱스 
                }
            }
            System.out.println();
        }
        
    }
    
}