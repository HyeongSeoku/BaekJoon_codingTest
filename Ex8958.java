import java.util.Scanner;

public class Ex8958 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st [] =new String [n];
        for(int i=0;i<n;++i)
        {
            st[i]=sc.next();      
        }
        sc.close();

        int count,total;
        for(String result : st)
        {
            count = 0;
            total = 0;
            for(int i=0;i<st.length;++i)
            {
                if(result.charAt(i)=='O')
            {
                total+=count++;
            }else{
                count = 0;
            }
        }
        System.out.println(total);
        }
       

    }
    
}