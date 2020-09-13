package 정렬;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
public class Ex10989 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int [T];

        for(int i = 0; i<T; ++i)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);

        for(int i=0; i<T; ++i)
        {
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}

/*
    Scanner 사용시 메모리 초과
    
*/
