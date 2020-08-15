import java.util.Scanner;

import java.util.Scanner;
import java.util.Arrays;
public class Ex1546 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int score[] = new int[n];
      
        for(int i=0;i<n;++i)
        {
            score[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(score);
        int max = 0;
        int ave = 0;
        int sum = 0;
        max = score[n];
        for(int i=0;i<n;++i)
        {
            score[i]=score[i]/max*100;
            sum+=score[i];
        }
        ave=sum/n;
        System.out.println(sum);
        System.out.println(max);
        System.out.println(ave);
    }
    
}