package 클래스2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Ex18111 {
    // 집터 => 2차원 배열
    // 땅 높이 => 카운트 변수 (최대 256)
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine[]  = br.readLine().split(" ");
        int N =Integer.parseInt(firstLine[0]);  //세로 길이
        int M =Integer.parseInt(firstLine[1]);  //가로 길이
        int B =Integer.parseInt(firstLine[2]);  //인벤토리의 블록 개수
        int GroundHeight[][] = new int[N][M];
        int TimeCnt = 0;                        //걸리는 시간 

        int Frequency[] = new int [256];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int MinFrequence = 987654321, MaxFrequence = -1;

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
            MinFrequence = Math.min(Frequency[i],MinFrequence);
            MaxFrequence = Math.max(Frequency[i],MaxFrequence);
            map.put(i,Frequency[i]);
        }
        while(true ) //While 문 수정! 땅의 모든 높이가 같을때 까지. => Frequency에 저장된 값이 1개 일때 까지
        {
            if(MaxFrequence-MinFrequence<0)     //최대빈도 값의 키값 - 최소빈도 값의 키값 < 0  (key,value)
            {
                
            B = B+(map.get(MinFrequence));
            TimeCnt += 2;

            }
        }
        
        /*System.out.println(map);
        System.out.println(MinFrequence+" "+MaxFrequence);
    */
    }
    
}
