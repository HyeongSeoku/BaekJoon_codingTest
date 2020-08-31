package 수학2;
import java.util.Scanner;

public class Ex1978 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       //입력할 숫자의 개수
        int arr[] = new int[N+1];   //입력받을 숫자 배열
        int count = 0;              //소수의 개수

        for(int i=1; i<=N; ++i)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)         //2로 나눠지면 소수가 아님.
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}