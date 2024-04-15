package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i]=1; // 모든 원소는 자기 자신만으로 길이 1의 감소하는 부분 수열을 형성함
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i] && dp[i]<dp[j]+1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            if (maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }
        System.out.println(maxLength);
    }
}
