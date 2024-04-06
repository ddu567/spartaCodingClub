package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 알고리즘 1주차 5강 2차원 배열 강의 보기
public class Q1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] matrix = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                matrix[i][j] =  str.charAt(j) == 'W';
            }
        }

        int chessRow = N - 7;
        int chessColumn = M - 7;

        for (int i = 0; i < chessRow; i++) {
            for (int j = 0; j < chessColumn; j++) {
                // 최솟값 구하기
            }
        }
    }

    public static void solve (boolean[][] matrix, int x, int y) {
        int chessX = x + 8;

    }
}
