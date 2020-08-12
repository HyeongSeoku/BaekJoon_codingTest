import java.util.Scanner;

public class Ascii {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String asc = sc.next();
        //String 변수 asc 를 int형 변수 result 로
        int result = asc.charAt(0); //0번 인덱스

        System.out.println(result);
    
        sc.close();
        //문제번호 : 11654
    }
    
}