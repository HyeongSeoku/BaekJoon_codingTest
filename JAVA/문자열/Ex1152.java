package 문자열;
import java.util.Scanner;

public class Ex1152 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();        //입력 받을 문자
        int count = 0;                      //공백을 셀 카운트 함수
        
        for(int i=0;i<sentence.length();++i)
        {
            if(sentence.charAt(i)==' ')     //입력받은 문자열을 하나하나 체크 , 공백일시 카운트 증가
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
    
}