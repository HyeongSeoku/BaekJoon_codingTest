package 클래스3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex1764 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		ArrayList<String>a1=new ArrayList<>();
		for(int i=0;i<N;i++){
			a1.add(br.readLine());
		}
		Collections.sort(a1);
		
		String[]temp=new String[a1.size()];
		temp=a1.toArray(temp);
		
		ArrayList<String>a2=new ArrayList<>();
		for(int i=0;i<M;i++){
			String s=br.readLine();
			int idx=Arrays.binarySearch(temp, s);
			if(idx>=0){
				a2.add(s);
			}
		}
		
		Collections.sort(a2);
		System.out.println(a2.size());
		for(String s : a2){
			System.out.println(s);
		}
	}
}
