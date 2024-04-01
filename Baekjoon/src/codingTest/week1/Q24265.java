package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
//stackOverFlow.

        long num = (long)(n-1)*n/2;
        System.out.println(num);
        System.out.println(2);
    }
}