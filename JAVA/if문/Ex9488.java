package if문;
import java.util.Scanner;
public class Ex9488 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();
        sc.close();
        if(Score<=100&&Score>=90)
        {
            System.out.println("A");
        }else if(Score<=89&&Score>=80)
        {
            System.out.println("B");
        }else if(Score<=79&&Score>=70)
        {
            System.out.println("C");
        }else if(Score<=69&&Score>=60)
        {
            System.out.println("D");
        }else
        {
            System.out.println("F");
        }
    }
}