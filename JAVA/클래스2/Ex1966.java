package 클래스2;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;
public class Ex1966 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();  //테스트 케이스 개수
        int N,M,count ;
        LinkedList <int[]> queue = new LinkedList<>();
        for(int i=0;i<Case; ++i)
        {
             N = sc.nextInt();   //문서의 갯수
             M = sc.nextInt();   //조회를 원하는 문서의 위치(번호)
             count = 0;
            queue.clear();
            for(int j=0; j<N; ++j)
            {
                queue.add(new int[] {j,sc.nextInt()});
            }

            while(!queue.isEmpty())
            {
                int now [] = queue.poll();
                boolean isPriority = true;

                for(int[] q : queue)
                    if(q[1]> now[1])
                    {
                        isPriority = false;
                    }
                if(isPriority){
                    count++;
                    if(now[0]==M) break;
                }
                else{
                   queue.add(now);
                }
            }
            System.out.println(count);
        }    
            
    }
}
//성공 2020.12.22