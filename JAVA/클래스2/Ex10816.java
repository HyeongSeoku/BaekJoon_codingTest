package 클래스2;
import java.util.Arrays;
import java.util.Scanner;
public class Ex10816 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //카드의 개수
        int card[] = new int[N];
        
        for(int i=0; i<N; ++i)
        {
            card[i]=sc.nextInt();
        }
        int M =sc.nextInt();
        int num[]= new int[M];  //구해야할 M개의 정수
        for(int j=0; j<M; ++j)
        {
            num[j] = sc.nextInt();
        }
        Arrays.sort(card);
        Arrays.sort(num);
        for(int z = 0; z<num.length; ++z)
        {
            int result = 0;
            result = Binary(card, num[z]);
            System.out.println(result+"");
        }


    }
    public static int Binary(int n[], int key)
    {
        int left =0 , middle , right = n.length -1 ;
        int cnt = 0;
        for(int i=0;i<n.length; ++i)
        {
                
           while(left<=right)
           {
               middle =(left + right)/2;

               if(key ==n[middle])
               {
                   cnt++;
                   if(n[middle-1]== key)
                   {
                       middle -=1 ;
                       while(middle-->0)
                       {
                           cnt ++;
                           if(n[middle]!=key)
                           {
                               break;
                           }
                       }
                   }
               }    //찾는값이 중앙값과 같을경우
               else if(key<middle)
               {
                 right = middle -1 ;
                 middle = left+right /2 ;
               }    //찾는 값이 중앙값보다 작을경우
               else if(key>middle)
               {
                 left = middle +1 ;
                 middle = left+right /2;
               }    //찾는 값이 중앙값보다 클경우
               
           } 
        }
        return cnt;
    }
}
