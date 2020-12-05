package JAVA.문자열;
import java.util.*;
public class Ex2941 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String [] Croatia ={"c=","c-","dz=","d-","lj","nj","s=","z="};  //크로아티아 알파벳
        String str =sc.nextLine();
        sc.close();
        for(int i=0;i<8;++i)
        {
            str = str.replace(Croatia[i], "*");  //str 중 Croatia에 해당되는 문자열을 전부 *로 변경
        }
            System.out.println(str.length());

    }
}
//String.replace(old String, new String) : old 문자열을 new 문자열로 바꿈