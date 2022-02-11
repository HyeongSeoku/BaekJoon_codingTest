package 클래스3;
import java.util.Scanner;
public class Ex1676 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int two=0,five=0;
        int N = sc.nextInt();
        for(int i=2;i <N; i*=2)
        {
            two +=N/i;
        }
        for(int j=5; j<N; j*=5)
        {
            five += N/j;
        }
        System.out.println(Math.min(two,five));
    }
  
}
