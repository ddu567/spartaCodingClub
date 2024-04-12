package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 회의의 수
        int[][] arr = new int[N][2]; // 회의의 시작과 끝을 저장하는 배열
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x; // 시작 시간
            arr[i][1] = y; // 끝 시간
        }
        br.close();

        // 끝나는 시간을 기준으로 오름차순, 같은 경우 시작 시간이 빠른 순으로 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 끝 시간이 같다면 시작 시간을 오름차순으로 정렬
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int count = 1; // 회의 개수. 첫 번째 회의는 무조건 포함
        int end = arr[0][1]; // 첫 번째 회의의 끝나는 시간
        for (int i = 1; i < N; i++) {
            // 다음 회의의 시작 시간이 현재 회의의 끝나는 시간보다 늦을 경우
            if (arr[i][0] >= end) {
                count++;
                end = arr[i][1]; // 다음 회의의 끝나는 시간으로 업데이트
            }
        }
        System.out.println(count);
    }
}
