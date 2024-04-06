package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 나무의 수
        int N = Integer.parseInt(st.nextToken());
        // 나무의 높이
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]); // 최대 높이 구함
        }

        long left = 0, right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right ) / 2; // 중간값
            long sum = 0; // 나무들의 합

            // 각 나무를 중간 높이로 자랐을 때 필요한 나무의 길이 계산
            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum >= M) { // 필요한 나무의 길이가 목표보다 크거나 같으면 범위를 오른쪽으로 조절
                answer = Math.max(answer, mid);
                left = mid + 1;
            } else { // 필요한 나무의 길이가 부족하면 범위를 왼쪽으로 조절
                right = mid -1;
            }
        }
        System.out.println(answer);
    }
}
