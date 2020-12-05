package networkP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class project_9 {
        static File file = new File("C:/Users/kim h s/Desktop/BaekJoon/networkP11/input.html");
    public static void main(String[] args)throws IOException{
        
        BufferedReader brC = new BufferedReader(new InputStreamReader(System.in));   //키보드로 입력과 출력 (0,1) 을 입력할 BufferedReader 객체

        System.out.print("URL 주소를 입력하세요. [입력:0 // 닫기 :1 ]:" );
        int Select = Integer.parseInt(brC.readLine());
        
        if(Select == 0)             
         //입력
        {
            (new project_9()).InputToFileFromURL();    //새로운 InputToFile()메소드 생성   (non-static Error 해결)
        }else if(Select == 1)
        
        {
            System.out.println("종료합니다.");
            
        }

    }

    public void InputToFileFromURL() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //키보드로 메세지를 입력할 BufferedReader 객체
        FileWriter writer = new FileWriter(file);       //bw에 사용할 FileWriter 객체      
        BufferedWriter bw = new BufferedWriter(writer); //파일에 입력 받은 메세지를 작성할 bw객체 

        String URLaddress = br.readLine();
        URL url = null;
        try{
            url = new URL(URLaddress);
            BufferedReader Ubr = new BufferedReader(new InputStreamReader(url.openStream()));

            System.out.println("접속 !");
            String inputLine;
            StringBuilder st = new StringBuilder();

            while((inputLine = Ubr.readLine())!= null)   //더 이상 읽을 라인이 없을 때 까지
            {
                bw.append(inputLine);
                bw.append("\n");
            }
                br.close();
                bw.close();
        
        }catch(MalformedURLException e){
            System.out.println("The URL address is incorrect.");
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
