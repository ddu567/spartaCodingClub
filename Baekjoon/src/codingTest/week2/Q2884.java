package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        br.close();

        if (M < 45) {
            if (H == 0) {
                H = 23;
            } else {
                H--;
            }
            M += 15;
            System.out.println(H + " " + M);
        } else {
            M -= 45;
            System.out.println(H + " " + M);
        }
    }
}
