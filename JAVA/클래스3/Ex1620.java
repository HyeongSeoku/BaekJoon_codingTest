package 클래스3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex1620 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine[] = br.readLine().split(" ");
        
        int N =Integer.parseInt(firstLine[0]);
        int M =Integer.parseInt(firstLine[1]);

        HashMap<String , Integer> nameMap = new HashMap<String, Integer>();
        String nameArr[] = new String[N+1];
        StringBuilder st = new StringBuilder();

        for(int i=1;i<=N; ++i)
        {
            String Pkname = br.readLine();
            nameMap.put(Pkname,i);
            nameArr[i] = Pkname ;
        }

        while(M -->0)
        {
            String findStr = br.readLine();
            if(isStringNumber(findStr))   //숫자를 입력 받은경우
            {
                int index = Integer.parseInt(findStr);
                st.append(nameArr[index]);
            }else{  //문자를 입력받은 경우
                  st.append(nameMap.get(findStr));
            }
            st.append("\n");
        }
        System.out.println(st.toString());
    }
    //문자열인지 숫자열인지 판단하는 함수
    public static boolean isStringNumber(String s)
    {
        try{
            Double.parseDouble(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
