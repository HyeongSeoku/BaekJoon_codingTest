package 클래스2;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1654 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String firstline[] = br.readLine().split(" ");
        int LanCnt = Integer.parseInt(firstline[0]);  //랜선의 개수
        int LanLength = Integer.parseInt(firstline[1]);  //원하는 랜선의 길이(길이가 모두 같은)
        
        int Lans[] = new int [LanCnt];
        for(int i =0; i<LanCnt; ++i)
        {
            Lans[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(Lans);

        long max = Lans[LanCnt - 1];
        long min = 1;
        long middle =0;

        while(max >= min)
        {
            middle = (max+min)/2 ;
            long allCnt = 0;
            for(int j = 0; j<Lans.length; ++j)
            {
                allCnt += Lans[j]/middle ;  
            }
            if(allCnt >= LanLength)
            {
                min = middle + 1;
            }
            else if(allCnt < LanLength)
            {
                max = middle - 1;
            }
        }  //while문
        System.out.println(max);

    }
}
