import java.util.*;

public class StarDraw2 {
    public static void main(String args[])
    {
        Scanner sc = new  Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num;i++)             //역 삼각형
        {
            //공백
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");

            }
            //별
            for(int k=0;k<(2*num-1)-(2*i);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < num - 1; i++) {	
        
			// 공백
			for (int j = 1; j < (num - 1) - i; j++) {	
				System.out.print(" ");
			}
 
			// 별
			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
            
            System.out.println();
        }
        sc.close();
    }
    
}