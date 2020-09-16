package 클래스2;
import java.util.Scanner;
import java.util.Arrays;
public class Ex1920 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr_N[] = new int[N];
        for(int i =0; i<N; ++i)
        {
            arr_N[i] = sc.nextInt();
        }
        //이진검색을 위해 배열 오름차순 정렬
        Arrays.sort(arr_N);
        
        int M = sc.nextInt();
        for(int j=0; j<M; ++j)
        {
            System.out.println(BinarySearch(arr_N, sc.nextInt()));
            
        }
        
    }
    public static int BinarySearch(int arr[],int num)
    {
        int high = arr.length -1 , middle = 0 , low =0 ;

        while(low<=high)
        {
            middle = (high + low) /2 ;

            if(arr[middle]==num)
            {
                return 1;
            }else if(arr[middle]>num)
            {
                high = middle -1 ;
            }else
            {
                low = middle + 1;
            }
        }
        return 0;
    }
}
