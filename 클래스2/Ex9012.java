package 클래스2;
import java.util.Scanner;
import java.util.Stack;
public class Ex9012 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-->0)
        {
            String str =sc.next();
            Stack<Character> stack = new Stack<Character>();
            boolean isVPS = true;
            char tmp;
            for(int i =0; i<str.length();++i)
            {
                tmp = str.charAt(i);
                if(tmp == '(')
                {
                    stack.push(tmp);
                }else if (tmp ==')')
                {
                    if(!stack.isEmpty())
                    {
                        stack.pop();
                    }else{
                        isVPS = false;
                        break;
                    }
                }
            }//end for
                if(!stack.isEmpty())
                    isVPS = false;
                if(isVPS==true)
                {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            
        }//end while
       
    }
}
