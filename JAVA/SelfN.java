import java.util.Scanner;
public class SelfN {
    static int dn;
 public static void main(String arags[])
 {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    test(a);
    System.out.println(dn);
    sc.close();
 }  
 private static int test(int n)
 {
     dn = n;
    while(n>0)
    {
        dn += n%10;
        n /=10;
    }
    return dn;
 
 }  
 //문제 번호 :4673

}