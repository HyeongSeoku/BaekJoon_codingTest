package JAVA.실습1;
import java.util.Scanner;

public class Average {
    public static void main(String args[])
    {
        int stu [] = new int[5];
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            stu[i]=sc.nextInt();
            if(stu[i]<40)
            {
                stu[i]=40;
            }
        }
        avg =(stu[0]+stu[1]+stu[2]+stu[3]+stu[4])/5;
        System.out.println(avg);

        sc.close();
    }
    
}