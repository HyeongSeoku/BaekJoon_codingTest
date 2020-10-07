package 클래스2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;

public class Ex1874 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());   //입력받을 수열 개수
         int arr [] = new int[N];
         int num = 1;                              //수열을 만들기 위해 1~N이 되는수                    
         Stack<Integer> stack = new Stack<>() ;
         boolean isAble = true;
         StringBuilder sb = new StringBuilder();  //정답을 출력할 StringBuilder
         for(int i=0; i<N; ++i)
         {
            arr[i] = Integer.parseInt(br.readLine());
            
            if(isAble)
            {
            if(arr[i]>=num)
            {
                while(arr[i]>= num)
                {
                    stack.push(num);
                    num++;
                    sb.append("+ \n");
                }
            } //첫번째 if 문
            if(stack.isEmpty()) isAble = false ;
            else{
                while(arr[i]<=stack.peek())
                 {
                    stack.pop();
                    sb.append("- \n");
                    if(stack.isEmpty()) break;
                 }
              } //else 문
           }
        }
        if(isAble)
        {
            System.out.println(sb.toString());
        }else{
            System.out.println("NO");
        }
    }
}
