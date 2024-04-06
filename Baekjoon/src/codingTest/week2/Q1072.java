package codingTest.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken()); // 게임 횟수
        long Y = Long.parseLong(st.nextToken()); // 이긴 게임
        long Z = (Y * 100) / X;

        // 이진 탐색을 위한 변수 초기화
        long left = 1;
        long right = X;
        long result = -1;

        // 이진 탐색 수행
        while (left <= right) {
            // 중간 값 계산
            long mid = (left + right) / 2;
            // 새로운 승률 계산
            long newZ = ((Y + mid) * 100) / (X + mid);

            if (newZ > Z) {
                result = mid; // 결과 업데이트
                right = mid - 1; // 범위의 왼쪽 부분 탐색
            } else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}
