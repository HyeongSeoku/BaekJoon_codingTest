package 문자열;
import java.util.Scanner;

public class Ex5622 {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int result =0;
        input = input.toUpperCase();

        for(int i=0;i<input.length();++i)
        {
            //각 케이스마다 걸리는 시간 설정
            switch(input.charAt(i))
            {
                case 'A': case 'B': case 'C':
                    result += 3;
                    break;

                case 'D': case 'E': case 'F':
                    result += 4;
                    break;

                case 'G': case 'H': case 'I':
                     result += 5;
                     break;

                case 'J': case 'K': case 'L':
                     result += 6;
                     break;

                case 'M': case 'N': case 'O':
                    result += 7;
                    break;

                case 'P': case 'Q': case 'R': case 'S':
                     result += 8;
                     break;

                case 'T': case 'U': case 'V':
                    result += 9;
                    break;

                case 'W': case 'X': case 'Y': case 'Z':
                    result += 10;
                    break;

            }
        }
            System.out.println(result);
    }
}  
//숫자 1 => 2초 숫자 1보다큰수 =>2초 +1