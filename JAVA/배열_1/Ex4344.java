package JAVA.배열_1;
import java.util.Scanner;
public class Ex4344 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int C =sc.nextInt();//테스트 케이스의 개수  
        double avg = 0;     //평균
        for(int i=0;i<C;++i)
        {
            int N =sc.nextInt();//테스트 케이스마다 학생의 수
            int score[] = new int[N+1];
            int num = 0;        //평균 넘는 학생수,한번 돌때마다 초기화
            int sum = 0;        //합계 , ''
            for(int j=0;j<N;++j)
            {   
                score[j]=sc.nextInt();
                sum+=score[j];
            }
            avg = (double)sum/N;
            for(int z=0;z<N;++z)
            {
                if(score[z]>avg)// 평균보다 높은 성적 가진 학생
                {
                    num++;  //학생수 +1
                }
            }
            System.out.printf("%.3f",100.0*num/N);
            System.out.println("%");
        
        }
        sc.close();
    }
    
}