package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 배열 A의 크기
        int M = Integer.parseInt(st.nextToken()); // 배열 B의 크기

        // 배열 A 입력
        int[] arrA = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 B 입력
        int[] arrB = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int[] arr = new int[N+M];
        System.arraycopy(arrA, 0, arr, 0, N);
        System.arraycopy(arrB, 0, arr, N, M);
        Arrays.sort(arr);

        for (int i = 0; i < N + M; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
}
