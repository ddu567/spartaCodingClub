package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 런타임 에러
public class Q2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            String[] numbers = br.readLine().split(" ");
            for (String num : numbers) {
                int n = Integer.parseInt(num);
                // 최소 힙에 수를 추가
                q.offer(n);

                // N보다 크면 최소 힙에서 하나 제거
                if (q.size() > N) {
                    q.poll();
                }
            }
        }

        // 힙의 최상단에 있는 수가 N번째로 큰 수
        System.out.println(q.peek());
    }
}
