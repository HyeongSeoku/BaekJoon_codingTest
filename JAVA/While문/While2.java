package JAVA.While문;
import java.util.Scanner;

public class While2{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int first, second;

        while(sc.hasNextInt())      //입력 값이 없을때 까지
        {
            first = sc.nextInt();
            second =sc.nextInt();
          System.out.println(first+second);
        }

        sc.close();
    }
}