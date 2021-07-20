package 클래스2;
import java.util.*;

public class Exkako {
    public static void main(String[] args) {
        String [] cmd ={"D 2","U 2","C","D 3","Z","D 1","Z"};
        solution(8,2,cmd);
    }

    public static String solution(int n, int k, String[] cmd) {
        String answer = "";
        //명령수행 시 stack에 이전 상태 저장
        Stack<Integer> ctrlZ = new Stack <>();
        int select = k ;        //처음 선택된 인덱스
        
        int tempN = n ;
        for(int i=0;i<cmd.length; i++)
        {
            String[] delete ={};
            String[] update = {};
            if(cmd[i].contains("D"))
            {
                //삭제 명령
                delete = cmd[i].split(" ");
                //select+ delete[1]= 삭제할 목표 인덱스
               select = select + Integer.parseInt(delete[1]);
                ctrlZ.push(select);
            }
            else if(cmd[i].contains("U"))
            {
                //선택할 인덱스 변경
                 update = cmd[i].split(" ");
                 select = select - Integer.parseInt(update[1]);
            }else if(cmd[i].contains("C")){
                ctrlZ.push(select);
                if(select==tempN-1){
                    //가장 마지막을 삭제시
                    tempN =-1;
                    select = select - 1;//바로 윗행 선택
                }
                select = select+ 1;
            }else if(cmd[i].contains("Z")){
                ctrlZ.pop();//변경된 목록에서 제거
            }
    
        }
        int z =0;
        int x =0;
        int[] commandList =new int [ctrlZ.size()]; //스택에 남은 아이템 담을 변수
        while(!ctrlZ.empty())
        {
            commandList[z] = ctrlZ.pop();
            z++;
        }
        Arrays.sort(commandList);
        
        for(int i =0; i<n; i++)
        {
            if(i==commandList[x])
            {
                x++;
                answer=answer+"X";
            }
            answer=answer+"O";
        }
        return answer;
    }


    
}

