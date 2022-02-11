package 클래스3;
import java.util.Scanner;
public class Ex1003_2 {
  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[][] = new int [41][2];   //N의 범위는 40까지, 각각 0과1의개수
        StringBuilder st = new StringBuilder();
        arr[0][0] = 1;    //N=0일때 0호출되는 횟수
        arr[1][1] = 1;    //N=1일때 1호출되는 횟수
        for(int i=2; i<41; ++i)
        {
            for(int j=0;j<2;++j)
            {
                arr[i][j] = arr[i-1][j]+ arr[i-2][j];//피보나치 수열 이용
            }
        }
        for(int z=0; z<T; ++z)
        {
            int n = sc.nextInt();
            st.append(arr[n][0]+" "+arr[n][1]);
            st.append("\n");
        }
        System.out.println(st);
    }//main 메소드
    
}
