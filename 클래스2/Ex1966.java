package 클래스2;
import java.io.IOException;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Ex1966 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();  //테스트 케이스 개수
        LinkedList <Integer> q = new LinkedList<>();
        StringBuilder st = new StringBuilder();
        for(int i=0;i<Case; ++i)
        {
            int N = sc.nextInt();   //문서의 갯수
            int M = sc.nextInt();   //조회를 원하는 문서의 위치(번호)
 
            int count = 0;
            int Imp[] = new int[N];    //중요도
            q.clear();
            for(int j=0; j<N; ++j)
            {
                q.add(Imp[i]=sc.nextInt());
            }

            while(!q.isEmpty())
            {
                boolean isPriority = true;

                for(int z=0; z<q.size(); ++z)
                {
                    if(q.peek()>q.get(z))
                    {
                        isPriority = false;
                        break;
                    }
                }
                if(isPriority){
                    count++;
                    q.poll();

                    if(M==0) break;
                    else M-=1;
                }
                else{
                    int temp = q.poll();
                    q.add(temp);
                    M=(M==0)? q.size()-1 : --M ;
                }
            }
            st.append(count).append("\n");         
        }    
            System.out.println(st);
    }
}
//실패 2020.10.08