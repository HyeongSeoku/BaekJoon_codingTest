package JAVA.While문;
import java.util.Scanner;

public class While3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //스캐너 생성
        int n = sc.nextInt(); //처음 입력 값
        int cnt = 0;// 카운트
        int numSum,newNum; //1의자리+10의자리 , 비교 값

        newNum = n;

        if(n!=0)
        {
            while(true)
            {
                numSum = newNum/10 + newNum%10; //10의자리 + 1의자리
                newNum = (newNum%10*10)+numSum%10;
                cnt++;

                if(n==newNum)                   //루프 탈출 조건 (카운트 횟수)
                break;
            }
        }

        System.out.println(n==0? 1:cnt);

        sc.close();
    }
   
}