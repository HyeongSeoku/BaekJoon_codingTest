package 클래스2;
import java.util.Scanner;
public class Ex15829 {
    public static final int MOD =1234567891;
    public static final int MULTIPLY = 31;
    public static void main(String args[])
    {
    
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();
        String [] word = new String[L] ;
        word =str.split("");
        int result = 0;
        double R = 1;
 
        for(int j =0;j<L; ++j)
        {
            int num = 0;
            switch(word[j]){
                case "a" :
                  num =1;
                  break;
                  case "b" :
                  num =2;
                  break;
                  case "c" :
                  num =3;
                  break;
                  case "d" :
                  num =4;
                  break;
                  case "e" :
                  num =5;
                  break;
                  case "f" :
                  num =6;
                  break;
                  case "g" :
                  num =7;
                  break;
                  case "h" :
                  num =8;
                  break;
                  case "i" :
                  num =9;
                  break;
                  case "j" :
                  num =10;
                  break;
                  case "k" :
                  num =11;
                  break;
                  case "l" :
                  num =12;
                  break;
                  case "m" :
                  num =13;
                  break;
                  case "n" :
                  num =14;
                  break;
                  case "o" :
                  num =15;
                  break;
                  case "p" :
                  num =16;
                  break;
                  case "q" :
                  num =17;
                  break;
                  case "r" :
                  num =18;
                  break;
                  case "s" :
                  num =19;
                  break;
                  case "t" :
                  num =20;
                  break;
                  case "u" :
                  num =21;
                  break;
                  case "v" :
                  num =22;
                  break;
                  case "w" :
                  num =23;
                  break;
                  case "x" :
                  num =24;
                  break;
                  case "y" :
                  num =25;
                  break;
                  case "z" :
                  num =26;
                  break;
                }
            result+=num*Math.pow(MULTIPLY,j);  
 
        }
        
        System.out.println(result);
    }
    
}
