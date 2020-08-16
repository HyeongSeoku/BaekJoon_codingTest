import java.util.Scanner;
import java.util.HashSet;

public class Ex3052 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<Integer>();

        for(int i=0;i<10;++i)
        {
            hash.add(sc.nextInt()%42);
            //입력 받은 값의 나머지 값을 HashSet에 저장
            
        }
        sc.close();
        System.out.println(hash.size());

    }
    
}