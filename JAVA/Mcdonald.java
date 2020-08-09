import java.util.Scanner;

public class Mcdonald {
    public static void main(String args[])
    {
        int bur[] = new int[3];     //버거 종류 3
        int drk[] = new int[2];     //음료 종류 2
        int setM = 0;               //세트 메뉴 가격
        int sale = 50;              //세트 메뉴시 50원 할인

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++)       //반복문으로 버거 입력(3)
        {
            bur[i] = sc.nextInt();
        }

        for(int i=0;i<2;i++)       //반복문으로 음료 입력(2)
        {
            drk[i] = sc.nextInt();
        }
        //버거 최솟값 세 수 비교
        if(bur[0]<bur[1] && bur[0]<bur[2])  
        {
            setM =bur[0];
        }else if(bur[1]<bur[0] && bur[1]<bur[2])
        {
            setM = bur[1];
        }else{
            setM=bur[2];
        }
        //음료 최솟값 
        if(drk[0]<drk[1]){
            setM +=drk[0];
        }else{
            setM+=drk[1];
        }
        //세트메뉴 할인
        setM = setM - sale ;

        System.out.println(setM);
        
        sc.close();
    }
    
}