package codingTest.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[28];
        for (int i = 0; i < 28; i++) {
            students[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(students);
        
    }
}
