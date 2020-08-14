import java.util.Scanner;
import java.util.Arrays;
public class Ex10818 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();       //입력받을 정수의 갯수
        int arr[] = new int[count];     //배열 생성
        for(int i =0;i<count;++i)       
        {
            arr[i]=sc.nextInt();        //count개 만큼 정수 입력 받음
        }
        sc.close();
       Arrays.sort(arr);                //핵심.

       System.out.print(arr[0]+" "+arr[count-1]);
       
    }
    //문제 번호:10818
}