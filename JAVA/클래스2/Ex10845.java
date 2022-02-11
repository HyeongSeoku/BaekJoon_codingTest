package 클래스2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10845 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        StringBuilder st = new StringBuilder(); // 결과 출력할 문자열 담을 빌더
        Queue<Integer> q = new LinkedList<Integer>();
        int x;
        int last = 0;
        q.clear();
        for (int i = 0; i < N; ++i) {
            String str = sc.nextLine();

            String s[] = str.split(" "); // 공백으로 문자열 구분
            String cmd = s[0];

            if (cmd.equals("push")) {
                x = Integer.parseInt(s[1]);
                last = x;
                q.offer(x);
            } // push 문

            else if (cmd.equals("pop")) {
                if (q.isEmpty()) {
                    st.append("-1");
                    st.append("\n");
                } else {
                    st.append(q.poll());
                    st.append("\n");
                }
            } // pop 문

            else if (cmd.equals("size")) {
                if (q.isEmpty()) {
                    st.append("0");
                    st.append("\n");
                } else {
                    st.append(q.size());
                    st.append("\n");
                }
            } // size 문

            else if (cmd.equals("empty")) {
                if (q.isEmpty()) {
                    st.append("1");
                    st.append("\n");
                } else {
                    st.append("0");
                    st.append("\n");
                }
            } // empty 문

            else if (cmd.equals("front")) {
                if (q.isEmpty()) {
                    st.append("-1");
                    st.append("\n");
                } else {
                    st.append(q.peek());
                    st.append("\n");
                }
            } // front 문

            else if (cmd.equals("back")) {
                if (q.isEmpty()) {
                    st.append("-1");
                    st.append("\n");
                } else {
                    st.append(last);
                    st.append("\n");
                }
            } // back 문

        } // for문

        System.out.println(st);
    }
}
