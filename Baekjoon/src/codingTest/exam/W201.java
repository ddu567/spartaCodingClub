package codingTest.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class W201 {
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 수빈이의 위치
        int K = Integer.parseInt(st.nextToken());   // 동생의 위치
        br.close();

        // 방문 여부 체크 배열 초기화
        visited = new boolean[100001];
        int result = bfs(N, K);
        System.out.println(result);


    }

    private static int bfs(int start, int end) {
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{start, 0});  // 시작 노드 추가
        visited[start] = true;  // 시작 노드 방문 체크

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int position = now[0];
            int time = now[1];

            if (position == end) {  // 목표 위치에 도달한 경우
                return time;  // 시간 반환
            }

            // 현재 위치(position)에서 이동할 수 있는 위치
            int[] nextPositions = {position + 1, position - 1, position * 2};
            for (int next : nextPositions) {  // nextPosition 배열의 각 위치(next)에 대해 검사
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    q.offer(new int[]{next, time + 1});
                    visited[next] = true;
                }
            }
        }
        return -1; // 목표 위치에 도달할 수 없는 경우 -1 변환
    }
}
