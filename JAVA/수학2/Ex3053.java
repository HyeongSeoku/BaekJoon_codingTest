package 수학2;
import java.util.Scanner;
public class Ex3053 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        sc.close();
        System.out.println(R*R*Math.PI);   //유클리드 원의 넓이
        System.out.println(2*R*R);          //택시 기하학의 원 넓이
    }
}

/*
    ============================
    유클리드 기하학에서의 원의 정의
    
    평면상의 어떤 점에서 거리가 일정한 점들의 집합
    ============================
    택시 기하학에서의 점의거리
    D(T1,T2) = |x1-x2| + |y1-y2|
    ============================
*/
