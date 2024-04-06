package codingTest.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        double[] score = new double[N];
        double M = 0, sum = 0, avg = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            if (score[i] > M) {
                M = score[i];
            }
        }
        br.close();

        for (int i = 0; i < N; i++) {
            score[i] = score[i] / M * 100;
            sum += score[i];
        }

        avg = sum/N;

        System.out.println(avg);
    }
}
