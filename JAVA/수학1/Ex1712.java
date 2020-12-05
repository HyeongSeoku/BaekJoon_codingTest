package JAVA.수학1;
import java.util.Scanner;

public class Ex1712 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int FixedC =sc.nextInt();
        int VarC = sc.nextInt();
        int LapC = sc.nextInt();
        sc.close();
        long result =0;
        if(LapC-VarC<=0)
        {
            result = -1;
        }else{
            result =(FixedC/(LapC-VarC))+1;
        }
        System.out.println(result);
    }
    
}