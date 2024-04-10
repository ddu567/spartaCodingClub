package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str=br.readLine()) != null) {
            int A = str.charAt(0)-48;
            int B = str.charAt(2)-48;
            // charAt() 은 해당 문자의 아스키코드 값을 반환하기 때문에 정수 형태로 변경하려면 반드시 -48 또는 -'0'을 해주어야 함
            sb.append(A + B).append("\n");
        }
        System.out.println(sb);
    }
}
