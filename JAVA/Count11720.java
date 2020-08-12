import java.util.Scanner;

public class Count11720 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int result = 0;
        String line = sc.next();
        for(int i=0;i<count;i++)
        {
            result+=line.charAt(i) -'0';
        }
        System.out.println(result);
    }
}