package 클래스2;

import java.util.Scanner;
import java.util.Stack;

public class Ex10773 {
    //합 최대 : 2^31 -1 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum = 0;
       int money;
       Stack <Integer> stack = new Stack<Integer>();

       for(int i=0; i<num; ++i)
       {
            money = sc.nextInt();
        
            if(money == 0 && !stack.isEmpty()){
                stack.pop();
            }else if (money != 0){
                stack.push(money);
            }
       }
       while(!stack.isEmpty())
       {   
            sum += stack.pop();
       }
       System.out.println(sum);

    }
    
}
