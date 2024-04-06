package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 런타임 애러 + 이해x
public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트케이스 수
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 문서의 개수
            int N = Integer.parseInt(st.nextToken());
            // 궁금한 문서의 위치
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            // 문서의 중요도
            Queue<int[]> queue = new LinkedList<>();

            // 문서의 중요도 입력
            for (int j = 0; j < N; j++) {
                queue.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] temp = queue.poll();
                boolean check = true;
                for (int[] q : queue) {
                    if (q[1] > temp[1]) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    if (temp[0] == M) {
                        break;
                    } else {
                        queue.add(temp);
                    }
                }
                System.out.println(count);
            }
        }
    }
}