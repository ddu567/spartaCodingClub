package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {

    static int N, S, count=0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        dfs(0, 0);

        // 합이 S인 경우가 없을 경우 빼기
        if (S == 0) {
            count--;
        }
        System.out.println(count);
    }

    public static void dfs(int depth, int sum){
        // 모든 원소를 탐색한 경우
        if (depth == N) {
            // 합이 S와 일치하는지 검사
            if (sum == S) {
                count++;
            }
            return;
        }

        dfs(depth + 1, sum + arr[depth]); // 현재 원소를 더하는 경우
        dfs(depth + 1, sum); // 현재 원소를 더하지 않는 경우
    }
}
