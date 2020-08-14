import java.util.*;
public class Ex2562 {
    public static void main(String args[])
    {
        int arr[]=new int[9];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;++i)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max =arr[0];        //최댓값 기준을 arr의 0번 인덱스로 지정
        int index = 1;          //최대값 위치 출력할 변수
        for(int i=0;i<arr.length;++i)        //핵심
        {
            if(arr[i]>max)      //최댓값(초기:arr[0])>arr[i]일경우
            {
                max =arr[i];    
                index = i+1;    
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    
}