package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 못 풀었음
public class Q1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 도시 개수
        int M = Integer.parseInt(br.readLine()); // 버스 개수
        int[][][] arr = new int[M][][];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i][i][0] = Integer.parseInt(st.nextToken()); // 출발점
            arr[i][i][1] = Integer.parseInt(st.nextToken()); // 도착점
            arr[i][i][2] = Integer.parseInt(st.nextToken()); // 비용
        }

        // 나의 경로
        int start = Integer.parseInt(st.nextToken()); // 출발점
        int end = Integer.parseInt(st.nextToken()); // 도착점
        br.close();
    }
}
