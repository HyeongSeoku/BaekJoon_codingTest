package 클래스2;
import java.util.Scanner;
public class Ex1259 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int N = sc.nextInt();
            if(N==0)break;
            if(Palindrome(N))
            {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    private static boolean Palindrome(int x)
    {
        char arr[] = String.valueOf(x).toCharArray(); //toCharArray : 문자열을 문자배열로 변환
        int s = 0 ,e = arr.length- 1;
        while(s<e)
        {
            if(arr[s] != arr[e])
            {
                return false;
            }
            s++; e--;
        }
        return true;
    }
}
