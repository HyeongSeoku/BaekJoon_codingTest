package JAVA.수학2;
import java.util.Scanner;

public class Ex1978 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       //입력할 숫자의 개수
        int arr[] = new int[N+1];   //입력받을 숫자 배열
        int sosuCount=0,count = 0;              //소수의 개수

        for(int i=1; i<=N; ++i)
        {
            arr[i] = sc.nextInt();  
            sosuCount = 0;      //소수카운트를 0으로 다시 초기화
            for(int j=1; j<=arr[i]; ++j)
            {
              

                //입력받은 수를 1~자기자신(arr[i])까지 나눴을때 
                //나머지가 0이면 카운트++
                if(arr[i]%j == 0)
                {
                    sosuCount++;
                }
            }
            //sosuCount가 2 (자기자신과 1 이면 개수 증가)
            if(sosuCount == 2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}