package 클래스2;
import java.util.Scanner;
import java.util.Stack;
public class Ex10828 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int num = sc.nextInt();
        for(int i=0 ; i<num; ++i)
        {
            String command = sc.next();
            if(command.equals("push")){
                int data = sc.nextInt();
                stack.push(data);
            }
            else if(command.equals("pop")){
                System.out.println(stack.isEmpty()? -1:stack.pop());
            }else if(command.equals("size")){
                System.out.println(stack.size());
            }else if(command.equals("empty")){
                System.out.println(stack.isEmpty()? 1:0);
            }else if(command.equals("top")){
                System.out.println(stack.isEmpty()? -1:stack.peek());
            }
        }
        sc.close();
    }
}
