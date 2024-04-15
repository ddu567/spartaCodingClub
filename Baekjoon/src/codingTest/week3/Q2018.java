package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 0;

        while (start <= end) {
            if (sum == n) {
                count++;
            }
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum >= n) {
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}
