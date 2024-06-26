package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] balls = new int[N];
        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < M; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int y = i; y <= j; y++) {
                balls[y-1] = k;
            }
        }
        br.close();

        for (int i = 0; i < N; i++) {
            sb.append(balls[i]).append(" ");
        }
        System.out.print(sb);
    }
}
