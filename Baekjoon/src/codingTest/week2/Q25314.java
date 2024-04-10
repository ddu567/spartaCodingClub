package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int num = N/4;
        StringBuilder sb = new StringBuilder();
        sb.append("long ".repeat(Math.max(0, num)));
        System.out.println(sb.append("int"));
    }

}
