package JAVA.수학1;
import java.util.Scanner;
public class Ex2292 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        sc.close();
        result =Room(N);
        System.out.println(result);
    }   
    private static int Room(int n)
    {
        int RoomN = 1;
        int addN = 6;
        int res = 1;
        while(true)
        {
            if(n<=RoomN)
            {
                break;
            }
            RoomN+=addN;
            addN+=6;
            res++;
        }
        return res;
    } 
}