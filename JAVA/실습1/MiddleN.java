package JAVA.실습1;
import java.util.Arrays;
import java.util.Scanner;

public class MiddleN {
    public static void main(String args[])
    {
        int num[] = new int[3];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            num[i]=sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[1]);

        sc.close();
    }
    
}