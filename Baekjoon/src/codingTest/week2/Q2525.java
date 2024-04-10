package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());
        br.close();

        A = C/60 + A;
        B = C%60 + B;

        if (B > 60) {
            A++;
            B -=60;
        } else if (B == 60) {
            A++;
            B=0;
        }
        if (A >= 24) {
            A -=24;
        }

        System.out.println(A + " " + B);
    }
}