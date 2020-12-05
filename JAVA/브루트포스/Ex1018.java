package JAVA.브루트포스;

import java.util.Scanner;
public class Ex1018 {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new boolean[N][M];
		
		/*
		 * Scanner 의 경우 공백자로 구분하다가
		 * 개행으로 입력되면 스트림에 개행이 남아있어서
		 * 의도와 달리 첫 번째 String 입력은 개행이 저장된다.
		 * 그렇기 때문에 nextLine() 을 통해 
		 * 문자열 입력 전의 int와 String 입력 사이의 개행을 없애주도록 한다.
		 */
		in.nextLine();
        
		// 배열 입력 
		for (int i = 0; i < N; i++) {
			String str = in.nextLine().trim();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;		// W일 때는 true 
				} else {
					arr[i][j] = false;		// B일 때는 false
				}
 
			}
		}
 
		
		int N_row = N - 7;
		int M_col = M - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
		in.close();
	}
 
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
 
		boolean TF = arr[x][y];	// 첫 번째 칸의 색 
 
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				// 올바른 색이 아닐경우 count 1 증가 
				if (arr[i][j] != TF) {	
					count++;
				}
				
				/* 
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false 라면 true 로
				 * 값을 변경한다.
				 */
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신 
		 */
		min = Math.min(min, count);
	}
}
 