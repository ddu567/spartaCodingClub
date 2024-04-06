package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람의 수
        int N = Integer.parseInt(br.readLine());

        // 기다린 시간
        int[] times = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
        // 오름차순 정리
        Arrays.sort(times);

        int waitingTime = 0; // 각 사람이 기다린 시간
        int totalTime = 0; // 전체 시간의 합

        // 시간 누적
        for (int i = 0; i < N; i++) {
            waitingTime += times[i];
            totalTime += waitingTime;
        }
        System.out.println(totalTime);
    }
}
