package 클래스2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Ex10845 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue q = new LinkedList<Integer>();
        int x ;
        int last =0 ;
        for(int i=0;i<N; ++i)
        {
            String str = sc.nextLine();

            String s[] = str.split(" "); //공백으로 문자열 구분
            String cmd = s[0];
            if(cmd.equals("push")){
                x = Integer.parseInt(s[1]);
                last = x;
                q.offer(x); 
            } //push 문

            else if(cmd.equals("pop")){
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(q.poll());
                }
            }  //pop 문
            
            else if(cmd.equals("size")){
                if(q.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(q.size());
                }
            }  //size 문

            else if(cmd.equals("empty")){
                if(q.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }  //empty 문

            else if(cmd.equals("front")){
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(last);
                }
            }  //front 문

            else if(cmd.equals("back")){
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(q.peek());
                }
            }  //back 문

        }  //for문
        
    }
}
