package codingTest.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] nums = new int[2][n];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nums[0][j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                nums[1][j] = Integer.parseInt(st.nextToken());
            }

            int[][] dp = new int[2][n];
            // 스티커 수 저장
            dp[0][0] = nums[0][0]; // 첫 번째 줄
            dp[1][0] = nums[1][0]; // 두 번째 줄

            if (n > 1) {
                dp[0][1] = nums[1][0] + nums[0][1];
                dp[1][1] = nums[0][0] + nums[1][1];
            }

            for (int j = 2; j < n; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + nums[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + nums[1][j];
            }
            sb.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
