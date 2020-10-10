package 클래스3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Ex11723 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int M =Integer.parseInt(br.readLine());
        int arr[] = new int [M];
        for(int i=0; i<M; ++i)
        {
            String secondLine[] = br.readLine().split(" ");
            String cmd = secondLine[0];
            int x = Integer.parseInt(secondLine[1]);
            int bitset = 0;
            if(cmd.equals("add"))
            {
                bitset = bitset | (1<<x);
                
            }else if(cmd.equals("remove"))
            {   
               bitset = bitset &~(1<<x);

            }else if(cmd.equals("check"))
            {
                if((bitset&(1<<x))>0) st.append("1\n");
                else st.append("0\n");

            }else if(cmd.equals("toggle"))
            {
                bitset = bitset^(1<<x);

            }else if(cmd.equals("all"))
            {
                bitset=(1<<21) -1;

            }else if(cmd.equals("empty"))
            {
                bitset = 0;
            }
        }
        System.out.println(st);
    }
}

/*
AND(&) : 대응하는 두 비트가 모두 1일때 1 반환
OR(|)  : 대응하는 두 비트 중 모두 1이거나 하나라도 1일때, 1 반환
XOR(^) : 대응하는 두 비트가 서로 다를 때 , 1 반환
NOT(~) : 비트 값 반전하여 반환
SHIFT(>>,<<) : 왼쪽 혹은 오른쪽으로 비트 옮겨 반환
<< : A*2^B
>> : A/2^B
*/