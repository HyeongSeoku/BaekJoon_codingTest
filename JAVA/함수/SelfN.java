package 함수;
public class SelfN {

 public static void main(String arags[])
 {
    int array[] = new int[10001]; //만개의 배열을 담기 위해서

     for(int i=1;i<=array.length;++i)
     {
        int Fn =getFn(i);
        if(Fn<=10000){          //Fn 즉, 리턴된 수(생성자가 있는 수) < 10000이면
            array[Fn]=1;        //  Fn번째 인덱스의 값 : 1
        }
     }

    for(int i=1;i<array.length;++i)
    {
        if(array[i]!=1)     //i번 인덱스의 값이 1이 아닐경우 (리턴된 수가 아닐경우)
        {
            System.out.println(i);   //그 수 출력
        }
    }

 }  

 private static int getFn(int n)    //생성자가 있는 수를 찾는 함수
 {
     int fn = n;
    while(n>0)
    {
        fn += n%10;
        n /=10;         //*몰랐던 내용 대입연산자 : A /= N 
    }                   //                    => A 를 N으로 나누고 다시 대입 
    return fn;          //리턴된 수는 생성자가 있는수
 
 }  
 //문제 번호 :4673

}