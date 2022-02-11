package 클래스1;
import java.util.Scanner;
public class Ex2920 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[8];
        for(int i=0; i<N.length; ++i)
        {
            N[i] = sc.nextInt();
        }
          sc.close();
        String output = "";
        for(int i=0; i<N.length-1; ++i)
        {
            if(N[i] == N[i+1]-1)
            {
                output = "ascending";
            }
            else if(N[i] == N[i+1]+1)
            {
                output = "descending";
                
            }else{
                output = "mixed"; 
                break;
            }
        }
         System.out.println(output);
    }
}
