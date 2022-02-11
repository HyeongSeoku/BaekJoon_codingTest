package 클래스2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true)
        {
            String input = br.readLine();
            if(input.equals("."))
            {
                bw.flush();
                return;
            };
            bw.write(Balanced(input));
        }

    }
    public static String Balanced(String s)
    {
        Stack<Character> stack  = new Stack<>();
        boolean result = true;

        for(char one : s.toCharArray())
        {   
            //들어온 문자가 왼쪽 소괄호 또는 대괄호일 경우
            if(one == '(' || one =='['){
                stack.push(one);
            }//들어온 문자가 오른쪽 소괄호 일경우 
            else if(one==')'){
                //스택이 비어 있는지 여부와 마지막으로 들어간 문자가 왼쪽 소괄호 인지 확인
                if(stack.isEmpty() || stack.pop() != '(')
                {
                    result = false;
                    break;
                }
                //들어온 문자가 오른쪽 대괄호 일경우
            } else if(one == ']'){
                //스택이 비어 있는지 여부와 마지막으로 들어간 문자가 왼쪽 대괄호 인지 확인
                if(stack.isEmpty() || stack.pop() != '[')
                {
                    result = false;
                    break;
                }
            }
            
        }
        //스택이 비어 있지 않는경우 ( 짝이 맞지 않아서 남은경우)
        if(!stack.isEmpty())
        {
            result = false;
        }
        //참일경우 yes | 아닐경우 no
        return result ? "yes\n" : "no\n";
    }
}
