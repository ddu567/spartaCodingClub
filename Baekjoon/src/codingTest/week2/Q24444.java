package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q24444 {
    // 그래프를 인접 리스트로 표현
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    // 정점의 방문 여부를 저장하는 배열
    static int[] checked;
    static int count;
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

        count = 1;
        bfs(R);

        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int node) {
        checked[node] = count; // 방문 여부
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);

        while (!q.isEmpty()) {
            int num = q.poll();
            for (int i = 0; i < graph.get(num).size(); i++) {
                int newNode = graph.get(num).get(i);
                if (checked[newNode] == 0) {  // 인접 정점이 방문되지 않았다면 방문 처리를 하고 큐에 삽입
                    count++;
                    checked[newNode] = count;
                    q.offer(newNode);
                }
            }
        }
    }
}
