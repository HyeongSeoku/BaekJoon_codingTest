package JAVA.While문;
import java.util.Scanner;

public class While1{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int first, second;

        while(true)
        {
            first = sc.nextInt();
            second =sc.nextInt();
            if(first==0 && second==0)break;
            System.out.println(first+second);
        }
        sc.close();
        //10952
    }
}