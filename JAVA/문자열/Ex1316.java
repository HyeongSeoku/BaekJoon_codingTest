package 문자열;
import java.util.Scanner;

public class Ex1316 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        int N = sc.nextInt();   // 입력할 문자열 개수
        int count = 0;
        for(int i=0;i<N;++i)
        {
           if(check()==true)
           {
               count++;
           }
        }
        System.out.println(count);
    }
    public static Boolean check()
    {
        boolean [] check = new boolean[26];     //알파벳 개수 
        int prev = 0;
        String str = sc.next();
        
        for(int i =0;i<str.length();++i)
        {
            int now = str.charAt(i);

            //앞선 문자와 i 번째 문자가 같지 않다면?
            if(prev!=now)
            {

                //해당 문자가 처음 나오는 경우(false인 경우)
                if(check[now-'a']==false)
                {
                    check[now-'a']=true;        //  true로 바꿔주고
                    prev = now;                 // 다음 턴을 위해 이전 단어 바꿔줌
                }
                //해당 문자가 나온 적 있는경우
                else
                {
                    return false ;      
                }
                
            }else{
                continue;
            }
        }
        return true;
    }
    
}