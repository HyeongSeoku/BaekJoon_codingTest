package 클래스2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex10866 {
    
    public static void main(String args[])  
    {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();    //명령의 수
        Deque<Integer> Dq = new LinkedList<>();
        StringBuilder st = new StringBuilder();
 
        for(int i =0; i<N; ++i){
 
            String cmd = sc.next();

            if(cmd.equals("push_front")){
                //정수 X를 덱의 앞에 넣는다
                int num = sc.nextInt();
                Dq.addFirst(num);
            }
            else if(cmd.equals("push_back")){
                //정수 X를 덱의 뒤에 넣는다
                int num = sc.nextInt();
                Dq.addLast(num);
            }
            else if(cmd.equals("pop_front")){
                
                if(Dq.isEmpty()){   // 덱이 비어있을 경우 -1 출력
                    st.append("-1");
                    st.append("\n");
                } 
                else         
                {   //덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다
                    st.append(Dq.removeFirst());
                    st.append("\n");
                }
                
            }
            else if(cmd.equals("pop_back")){

                if(Dq.isEmpty()){   // 덱이 비어있을 경우 -1 출력
                    st.append("-1");
                    st.append("\n");
                }
                else
                {   //덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다
                    st.append(Dq.removeLast());
                    st.append("\n");
                }

            }
            else if(cmd.equals("size")){
                //덱에 들어있는 정수의 개수를 출력한다
                st.append(Dq.size());
                st.append("\n");
            }

            else if(cmd.equals("empty")){

                if(Dq.isEmpty()){   //덱이 비어있으면 1을, 아니면 0을 출력한다
                    st.append("1");
                    st.append("\n");
                } else{
                    st.append("0");
                    st.append("\n");
                }
                

            }
            else if(cmd.equals("front")){
                
                if(Dq.isEmpty()){   //덱이 비어있으면 -1 출력
                    st.append("-1");
                    st.append("\n");
                } else{             //덱의 가장 앞에 있는 정수를 출력한다
                    st.append(Dq.peekFirst());
                    st.append("\n");
                }

            }
            else if(cmd.equals("back")){

                if(Dq.isEmpty()){   //덱이 비어있으면 -1 출력
                    st.append("-1");
                    st.append("\n");
                } else{             //덱의 가장 뒤에 있는 정수를 출력한다
                    st.append(Dq.peekLast());
                    st.append("\n");
                }
                

            }
        }
        System.out.println(st);
    }
}
