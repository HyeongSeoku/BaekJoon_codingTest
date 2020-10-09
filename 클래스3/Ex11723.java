package 클래스3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Ex11723 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M =Integer.parseInt(br.readLine());
        int arr[] = new int [M];
        for(int i=0; i<M; ++i)
        {
            String secondLine[] = br.readLine().split(" ");
            String cmd = secondLine[0];
            int x = Integer.parseInt(secondLine[1]);
            
            if(cmd.equals("add"))
            {
                if(arr[i])
                
                
            }else if(cmd.equals("remove"))
            {   
                if()
                {
                    continue;
                }

            }else if(cmd.equals("check"))
            {
                

            }else if(cmd.equals("toggle"))
            {

            }else if(cmd.equals("all"))
            {

            }else if(cmd.equals("empty"))
            {

            }
        }
    }
}
