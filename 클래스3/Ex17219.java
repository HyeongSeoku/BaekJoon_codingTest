package 클래스3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
public class Ex17219 {
    public static void main(String args[]) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine[] = br.readLine().split(" ");
        Hashtable<String, String> PssWdTable = new Hashtable<String, String>();
        StringBuilder st = new StringBuilder();

        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        for(int i=0; i<N; ++i)
        {
            String urlPsswd[] = br.readLine().split(" ");
            String url = urlPsswd[0];     //key
            String pssWd = urlPsswd[1];   //value
            PssWdTable.put(url,pssWd);
        }
        while(M --> 0)
        {
            String targetUrl = br.readLine();
            if(PssWdTable.containsKey(targetUrl)){
                st.append(PssWdTable.get(targetUrl));
            }else{
                st.append("Error");
            }
            st.append("\n");
        }
        System.out.println(st);
    }
}
