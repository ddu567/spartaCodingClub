package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10971 {
    static int N;
    static int[][] w;
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE; // 모든 비용과 비교하기 위해 큰 값으로 초기화

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        w = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                w[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        // 모든 시작 도시에 대해 dfs 함수를 호출하여 최소 비용 찾기
        for (int i = 0; i < N; i++) {
            dfs(i, i, 0, 0);
        }
        System.out.println(minCost);
    }

    static void dfs(int start, int current, int visitedCont, int cost) {
        // 모든 도시를 방문했고 시작 도시로 돌아온 경우
        if (visitedCont == N && start == current) {
            minCost = Math.min(minCost, cost);
        }

        // 다음 도시로 이동
        for (int next = 0; next < N; next++) {
            // 다음 도시를 방문하지 않았고, 현재 도시에서 다음 도시로 가는 경로가 있는 경우
            if (!visited[next] && w[current][next] != 0) {
                visited[next] = true;
                // 다음 도시로 재귀 호출
                dfs(start, next, visitedCont + 1, cost + w[current][next]);
                visited[next] = false;  // 백트래킹
            }
        }
    }
}
