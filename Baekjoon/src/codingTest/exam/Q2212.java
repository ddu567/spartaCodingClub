package codingTest.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 센서의 개수
        int K = Integer.parseInt(br.readLine()); // 집중국의 개수
        int[] sensor = new int[N]; // 센서의 좌표

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sensor[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sensor);

        // 거리 차이 배열
        int[] distance = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            distance[i] = sensor[i + 1] - sensor[i];
        }
        Arrays.sort(distance);

        int sum = 0;
        for (int i = 0; i < N - K; i++) { // (N-1) - (K-1)
            sum += distance[i];
        }
        System.out.println(sum);
    }
}
