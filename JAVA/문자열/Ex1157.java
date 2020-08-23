package 문자열;
import java.util.Scanner;

public class Ex1157 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];                  //알파벳 개수 = 26
        int max = 0;
        char answer ='?';

        String str = sc.next().toUpperCase();     //모두 대문자로 변환
        sc.close();

        for(int i = 0;i<str.length();++i)
        {
            arr[str.charAt(i)-65]++;        //65 = A

            if(max<arr[str.charAt(i)-65])
            {
                answer = str.charAt(i);
                max = arr[str.charAt(i)-65];
                
            }else if(max==arr[str.charAt(i)-65])
            {
                answer = '?';
            }
        }
        System.out.println(answer);
    
    }   
     
}