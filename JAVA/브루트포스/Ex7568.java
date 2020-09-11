package 브루트포스;
import java.util.Scanner;
public class Ex7568 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int T =sc.nextInt();
        int weight [] = new int [T];
        int height [] = new int [T];
        int ans [] = new int [T];
        for(int i=0;i<T;++i)
        {
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();            
        }
        //=======입력문=======
        
        for(int i=0;i<T;++i)
        {
            int cnt = 1;                //반복문 실행마다 카운트 1로 초기화
            for(int j =0; j<T;++j)
            {
                if(i==j)continue;           //i와j 같은 사람인 경우 건너뜀

                if(weight[i]<weight[j] && height[i]<height[j])
                {
                    cnt++;
                }
            }
            ans[i] = cnt;       
            System.out.print(ans[i]+" ");       //공백으로 구분하기 위해
        }
    }
}
