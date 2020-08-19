package 문자열;
import java.util.Scanner;

public class Ex10809 {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        for(int c='a';c<='z';++c)
        {   
            //문자열의 위치를 반환  : indexOf()
            System.out.print(input.indexOf(c)+" ");
        }
    }
}