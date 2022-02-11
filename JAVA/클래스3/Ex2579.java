package 클래스3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex2579 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int Stair[] = new int[T+1];
        int Score[] = new int[T+1];
        for(int i=1; i<=T; ++i)
        {
            Stair[i] = Integer.parseInt(br.readLine());
        }
        Score[1]=Stair[1];
        Score[2]=Stair[1]+Stair[2];
        Score[3]=Math.max(Stair[1]+Stair[2], Stair[2]+Stair[3]);

        for(int i=4; i<=T; ++i)
        {
            Score[i]=Math.max(Score[i-3]+Stair[i]+Stair[i-1],Score[i-2]+Stair[i]);

        }
        System.out.println(Score[T]);

    }
}
//DP프로그래밍
