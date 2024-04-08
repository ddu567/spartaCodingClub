package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q24479 {
    // 그래프를 인접 리스트로 표현
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] checked;  // 정점의 방문 여부를 저장하는 배열
    static int count;  // 정점을 방문할 때마다 증가하는 카운터
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점
        int M = Integer.parseInt(st.nextToken()); // 간선
        int R = Integer.parseInt(st.nextToken()); // 시작 정점


        // 점점 번호는 1부터 시작하므로 N+1 크기로 초기화
        checked = new int[N + 1];

        // 인접 리스트 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 무방향 그래프이므로 양방향으로 간선 추가
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        br.close();

        // 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;  // 시작 정점의 방문 순서는 1
        dfs(R);

        // 결과 출력
        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int node) {
        checked[node] = count; // 현재 노드를 방문 순서에 따라 체크

        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if (checked[newNode] == 0) { // 방문하지 않은 노드만 DFS 호출
                count++;
                dfs(newNode);
            }
        }
    }
}
