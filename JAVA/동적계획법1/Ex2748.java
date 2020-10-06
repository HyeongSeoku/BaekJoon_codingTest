package 동적계획법1;
import java.util.Scanner;
public class Ex2748 {
    public static void main(String[] args) {
        
       long a=0;
       long b=1;
       long c=0;
      
     Scanner sc = new Scanner(System.in);
             int cnt=sc.nextInt();
             if(cnt==1) {
                 System.out.println(1);
             }else {
             for(int i=1; i<cnt; i++) {
                 c=a+b;
                 a=b;
                 b=c;
             }
             System.out.println(c);
             }
         }
}
