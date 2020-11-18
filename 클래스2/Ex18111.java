package 클래스2;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


public class Ex18111 {
    // 집터 => 2차원 배열
    // 인벤토리 => 
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine[]  = br.readLine().split(" ");
        int N =Integer.parseInt(firstLine[0]);  //세로 길이
        int M =Integer.parseInt(firstLine[1]);  //가로 길이
        int B =Integer.parseInt(firstLine[2]);  //인벤토리의 블록 개수
        int GroundHeight[][] = new int[N][M];

        int Frequency[] = new int [256];

        for(int i=0; i<N; ++i)
        {
            String InputBlock[] ; 
            InputBlock = br.readLine().split(" ");
            for(int j =0; j<M; ++j)
            {
                int count = 0;
                GroundHeight[i][j] = Integer.parseInt(InputBlock[j]);
                count = GroundHeight[i][j];
                Frequency[count]++;
            }
        }
        //빈도 출력 확인
        for(int i=0;i<256; ++i)
        {
            if(Frequency[i]==0)
            {
                continue;
            }
            System.out.print(i+": "+ Frequency[i]+" ");
        }
        
    }
    
}
