import java.util.Scanner;
import java.util.Arrays;
public class Ex1546 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double score[] = new double[n]; //평균값이 정수가 아닐수 있으니 double 사용.
        double max = 0;                 // 동일
      
        for(int i=0;i<n;++i)
        {
            score[i]=sc.nextInt();
            if(score[i]>max)        //Arrays.sort 사용하지 않고, for 문 한번 돌때마다 max값 비교를 통해 최대값 구하는 방식.
            {
                max=score[i];
            }
        
        }
        sc.close();  
        double sum = 0;
        for(int i=0;i<n;++i)
        {
            score[i]=score[i]/max*100;
            sum+=score[i];
        }
        System.out.println(sum/n);
       
    }
    
}