package 문자열;
import java.util.Scanner;

public class Ex2908 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int newN1 , newN2;
        sc.close();
        for(int i=3;i>0;--i)
        {
            newN1 = num1.charAt(i);
            newN2 = num2.charAt(i);
        }
            if(newN1<newN2)
            {
                System.out.println(newN2);
            }else if(newN1>newN2)
            {
                System.out.println(newN1);
            }else
                System.out.println("equl");
    }
}