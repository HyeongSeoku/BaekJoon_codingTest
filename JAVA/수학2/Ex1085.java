package JAVA.수학2;
import java.util.Scanner;

public class Ex1085 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt() , Y = sc.nextInt() , W =sc.nextInt() , H =sc.nextInt();

        int resultY = Math.min(Y,H-Y);      //Y 와 H-Y 중 최소값
        int resultX = Math.min(X,W-X);

        System.out.println(Math.min(resultY,resultX));  
    }
}