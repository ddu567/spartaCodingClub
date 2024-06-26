package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
    static int[][] apt = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_apt();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i<T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호수
            sb.append(apt[k][n]).append("\n");
        }
        br.close();

        System.out.println(sb);
    }


    private static void make_apt() {
        // 0층과 1호 초기화
        for (int i = 0; i<15; i++) {
            apt[0][i] = i;
            apt[i][1] = 1;
        }

        for (int i = 1; i<15; i++) { // 1층부터 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }
    }
}
