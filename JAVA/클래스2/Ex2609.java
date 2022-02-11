package 클래스2;
import java.util.Scanner;

public class Ex2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = euclid(a, b);
        int lcm = lcm(a, b);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int lcm(int a, int b) {
        int gcd = euclid(a, b);
        int total = gcd * (a / gcd) * (b / gcd);

        return total;
    }

    private static int euclid(int a, int b) {
        int num = b;

        while (num != 0) {
            if (a % num != 0) {
                int temp = a;
                a = num;
                num = temp % num;
            } else {
                break;
            }
        }

        return num;
    }
}