package 클래스2;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Ex2805 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine [] = br.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);//나무의수
        int M = Integer.parseInt(firstLine[1]);  //가져가려는 나무의 높이
        int trees[] = new int [N];
        
        String secondLine[] = br.readLine().split(" ");
        for(int i=0;i<N; ++i)
        {
            trees[i] = Integer.parseInt(secondLine[i]);
        }
        //입력문
        Arrays.sort(trees); //이진 탐색을 위해 오름차순 정렬
        int lastInt = trees[N -1];

        int maxHeight = lastInt;  //톱날의 최대높이 
        int minHeight = 0;           //톱날의 최소높이
        int middle = 0 ;

        while(maxHeight>=minHeight)
        {
            int cutTree = 0;
            long sumTree = 0;  //int 형 안됨. 오버플로우 발생 
            middle = (maxHeight+minHeight)/2 ;

            for(int j=0; j<trees.length; ++j)
            {
                cutTree = trees[j] - middle;
                if(cutTree < 0){
                    cutTree = 0;
                }
                sumTree += cutTree ;
            } //for문

            if(sumTree >= M)    // 자른 나무의 합이 가져가려는 나무의 길이보다 클 경우
            {
                minHeight = middle + 1;
            }

            else if(sumTree < M)  // 자른 나무의 합이 가져가려는 나무의 길이보다 작을 경우
            {
                maxHeight = middle - 1;   //톱날의 높이를 낮추어야함 (더 많이 잘라야 하므로)
            }
           
        }  //while 문

            System.out.println(maxHeight);  //최대 높이

    }
}
