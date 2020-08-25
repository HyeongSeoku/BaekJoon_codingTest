package 문자열;
import java.util.Scanner;

public class Ex1152 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();        //입력 받을 문자
        sc.close();
        int count = 0;                      //공백을 셀 카운트 함수
        sentence = sentence.trim();//앞뒤 빈칸 제거

        for(int i=0;i<sentence.length();++i)
        {
            if(sentence.charAt(i)==' ') //입력받은 문자열을 하나하나 체크 , 공백일시 카운트 증가
            {
                count++;
            }
        }
        if(sentence.length()==0)    //공백만 입력될 경우
        {
            System.out.println(0);
        }else
            System.out.println(count+1);
      
    }
    
}