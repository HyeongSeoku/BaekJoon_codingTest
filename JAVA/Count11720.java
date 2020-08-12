import java.util.Scanner;

public class Count11720 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt(); //변수 line에 입력 할 수의 개수 입력
        int result = 0;

        String line = sc.next(); //String 이유 = 공백 없는 수 입력 때문 (아스키코드로 변환)

        for(int i=0;i<count;i++)
        {
            result+=line.charAt(i) -'0';        //charAt(i) : i번째 인덱스 
        }
        System.out.println(result);
    }
}