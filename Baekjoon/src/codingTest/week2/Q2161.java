package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        Queue<Integer> queue = new LinkedList<>();

        // 카드 초기화
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
            // offer 메서드: 큐에 공간이 부족한 경우 'false' 반환
            // add 메서드: 예외를 던짐
        }

        // 카드를 버리는 과정
        while (queue.size()>1) {
            // 제일 위에 있는 카드를 출력하고 버림
            System.out.print(queue.poll() + " ");
                // 그 다음 제일 위에 있는 카드를 제일 아래로 옮김
                queue.offer(queue.poll());
        }
        // 마지막 남은 카드 출력
        System.out.print(queue.poll());
    }
}
