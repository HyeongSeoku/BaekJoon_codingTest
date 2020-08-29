package 수학1;
import java.util.Scanner;

public class Ex2869 {
 
	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
 
		int up = sc.nextInt();		// A
		int down = sc.nextInt();	// B
		int V = sc.nextInt(); 	// C
        sc.close();

		int day = (V - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((V - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}