package 클래스2;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1181 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String arr [] = new String [N];

        sc.nextLine();          //개행 버림

        for(int i=0; i<N; ++i)
        {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String s1, String s2){
                //단어 길이가 같을 경우
                if(s1.length() == s2.length()){
                    //compareTo = 아스키 코드값 사용
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

            System.out.println(arr[0]);
        for(int i=1;i<N;++i)
        {
            if(!arr[i].equals(arr[i-1])){
                //중복되지 않는 단어만 출력
                System.out.println(arr[i]);
            }
        }
    }
}
