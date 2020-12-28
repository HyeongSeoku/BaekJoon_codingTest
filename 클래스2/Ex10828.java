package 클래스2;
import java.util.Scanner;
import java.util.Stack;
public class Ex10828 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder st  = new StringBuilder();
        int num = sc.nextInt();
        for(int i=0 ; i<num; ++i)
        {
            String command = sc.next();
            if(command.equals("push")){
                int data = sc.nextInt();
                stack.push(data);
            }
            else if(command.equals("pop")){
                st.append(stack.isEmpty()? -1:stack.pop());
                st.append("\n");
            }else if(command.equals("size")){
                st.append(stack.size());
                st.append("\n");
            }else if(command.equals("empty")){
                st.append(stack.isEmpty()? 1:0);
                st.append("\n");
            }else if(command.equals("top")){
                st.append(stack.isEmpty()? -1:stack.peek());
                st.append("\n");
            }
        }
        System.out.println(st);
    }
}
//2020.12.28 시간 초과 오류 => StringBuilder 사용
