package 클래스2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ex2164 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        Queue <Integer> q = new LinkedList<Integer>();
        for(int i=1; i<=N; ++i)
        {
            q.add(i);
        }
        //카드 입력
    
        while(q.size() != 1)
        //마지막 한장이 남을때 까지
        {
            q.poll();
            int num = q.poll();
            q.add(num);
            //한장 버리고 남은 한장을 제일 아래로
        }
            System.out.println(q.peek());
    }
    
}
