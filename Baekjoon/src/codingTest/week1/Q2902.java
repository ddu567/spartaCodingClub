package codingTest;

import java.io.*;
import java.util.StringTokenizer;

public class Q2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 하이픈(-) 단위로 끊음
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        StringBuilder sb = new StringBuilder();
        br.close();

        while (st.hasMoreTokens()) {
            // 하이픈 다음 글자 추가
            sb.append(st.nextToken().charAt(0));
        }
        System.out.println(sb);
    }
}
