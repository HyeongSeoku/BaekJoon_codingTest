package 배열_1;
import java.util.Scanner;
public class Ex2577 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int result = a*b*c;
        int arr[] ={0,1,2,3,4,5,6,7,8,9};

        for(int i= 0;i<=9;++i)
        {
            int tmp = result;   //결과 값 복사 본
            int count = 0;
            while(tmp!=0)   //(핵심) tmp가 0이 아닐때 까지
            {
                if(arr[i]==tmp%10)  //1의 자리부터 비교
                {
                    count++;
                }
                tmp/=10;            //10으로 나누고 대입
            }
            System.out.println(count);
        }
    }
    
}