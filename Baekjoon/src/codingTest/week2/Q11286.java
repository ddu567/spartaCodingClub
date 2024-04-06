package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 절댓값에 따라 우선순위를 결정하는 Comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    // 절댓값이 같을 경우, 값이 작은 것을 우선으로 함
                    return o1 - o2;
                } else {
                    // 절댓값이 다를 경우, 절댓값이 작은 것을 우선으로 함
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                // 입력이 0일 경우, 가장 작은 절댓값을 가진 수를 출력하고 제거
                int answer = pq.isEmpty() ? 0 : pq.poll();
                System.out.println(answer);
            } else {
                // 0이 아닌 수는 우선순위 큐에 추가
                pq.offer(x);
            }
        }
    }
}
