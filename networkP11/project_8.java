package networkP11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class project_8 {
        static File file = new File("C:/Users/kim h s/Desktop/input.txt");
    public static void main(String[] args)throws IOException{
        
        BufferedReader brC = new BufferedReader(new InputStreamReader(System.in));   //키보드로 입력과 출력 (0,1) 을 입력할 BufferedReader 객체

        System.out.print("기능을 선택하세요 [입력:0 // 출력 :1 ]:" );
        int Select = Integer.parseInt(brC.readLine());

        if(Select == 0)             
         //입력
        {
            (new project_8()).InputToFile();    //새로운 InputToFile()메소드 생성   (non-static Error 해결)
        }else if(Select == 1)
        //파일 출력
        {
            (new project_8()).OutputFromFile(); //새로운 OutputToFile()메소드 생성
        }else {
            System.out.println("선택 오류 입니다 ! ");
            
        }

    }

    public void InputToFile() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //키보드로 메세지를 입력할 BufferedReader 객체
        FileWriter writer = new FileWriter(file);       //bw에 사용할 FileWriter 객체      
        BufferedWriter bw = new BufferedWriter(writer); //파일에 입력 받은 메세지를 작성할 bw객체 

        String Message = br.readLine();
        try{
            bw.write(Message);

            System.out.println("DONE !");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(bw != null) bw.close();
                if(writer != null) writer.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public void OutputFromFile() throws IOException{
        FileReader fileReader = new FileReader(file);                   //BufferedReader 객체에 사용할 FilReader 객체
        BufferedReader bufReader = new BufferedReader(fileReader);      //파일에서 한줄씩 읽어들일 BufferedReader 객체
        try{
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }
            bufReader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
